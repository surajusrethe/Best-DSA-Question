/*********************************************************************** Question ***********************************************************************************/
Link : https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/
/*
Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent. If there are no nodes with an even-valued grandparent, return 0.

A grandparent of a node is the parent of its parent if it exists.

Example 1:

Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
Output: 18
Explanation: The red nodes are the nodes with even-value grandparent while the blue nodes are the even-value grandparents.
Example 2:


Input: root = [1]
Output: 0
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
1 <= Node.val <= 100
*/
/*********************************************************************** Approach ***********************************************************************************/

/*

- Binary tree ke root se shuru karo aur sum ko 0 se initialize karen.
- Agar root node ki value even hai, toh sum me unke grandchildren (uske children ke children) ke values ko add karo, jahaan woh exist karte hain.
- Root node ke left aur right children ke liye function ko recursive tarike se call karen aur unke sums ko overall sum me add karo.
- Is process ko binary tree ke sabhi nodes ke liye continue karo.
- Ant mein, even-valued grandparent wale nodes ke values ka total sum return karen.
*/

/*********************************************************************** Code ***********************************************************************************/



class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null) return 0;  // agar root null hai toh sum 0 return karo
        int sum = 0;  
        if((root.val & 1) == 0){  // agar root ki value even hai toh
            if(root.left != null && root.left.left != null) sum += root.left.left.val;  // agar left child ka left child hai toh uski value ko sum mein add karo
            if(root.left != null && root.left.right != null) sum += root.left.right.val;  // agar left child ka right child hai toh uski value ko sum mein add karo
            if(root.right != null && root.right.left != null) sum += root.right.left.val;  // agar right child ka left child hai toh uski value ko sum mein add karo
            if(root.right != null && root.right.right != null) sum += root.right.right.val;  // agar right child ka right child hai toh uski value ko sum mein add karo
        }
        
        return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);  // left aur right children ke liye `sumEvenGrandparent` function ko call karo aur unke sums ko add karke return karo
    }
}



/*********************************************************************** Dry run ***********************************************************************************/

/*
We call sumEvenGrandparent(root) with the root of the binary tree, which is 6.
Since root is not null, we initialize sum to 0.

Since root.val is even, we check its children for even-valued grandchild nodes:
root.left is not null, so we check its children.
root.left.left exists and has a value of 2, which is even. Therefore, we add its value to sum.
root.left.right does not exist, so we skip this line.

root.right exists, so we check its children.
root.right.left does not exist, so we skip this line.
root.right.right does not exist, so we skip this line.

At this point, sum is 2.

We make two recursive calls: sumEvenGrandparent(root.left) and sumEvenGrandparent(root.right).

For sumEvenGrandparent(root.left), we pass in root.left which is 7.
Since root.left is not null, we initialize sum to 0.
Since root.left.val is odd, we skip the if block and set sum to 0.

We make two recursive calls: sumEvenGrandparent(root.left.left) and sumEvenGrandparent(root.left.right).
root.left.left does not exist, so we skip this recursive call.
root.left.right does not exist, so we skip this recursive call.

At this point, sum is still 0, so we return 0.

For sumEvenGrandparent(root.right), we pass in root.right which is 8.
Since root.right is not null, we initialize `sum

*/
/*********************************************************************** Take Away ***********************************************************************************/



- Kya bitwise operator & is code me even ya odd value ko check karne ke liye use kiya gaya hai? Agar haan, to kya iske karan ye code ki speed improve hoti hai?

Haan, bitwise operator & even ya odd value ko check karne ke liye use kiya gaya hai. Vishesh roop se, (root.val & 1) == 0 root.val ka least significant 
bit check karta hai ki kya root.val even hai ya nahi. Bitwise operator isliye use kiya gaya hai kyunki ye modulus operator se check karne ke comparison me fast hai.

- Kya aap is code se odd-valued grandparent wale nodes ka sum find kar sakte hai? Agar haan, to kya iske liye code me kya modifications ki jarurat hai?

Haan, odd-valued grandparent wale nodes ka sum find karne ke liye code me (root.val & 1) == 1 check ko replace kar diya jaa sakta hai, jo ki current node ke value
ko odd hone ka check karta hai.


- Kya aap is code se 3 ke multiple wale grandparent nodes ka sum find kar sakte hai? Agar haan, to kya iske liye code me kya modifications ki jarurat hai?

Haan, 3 ke multiple wale grandparent nodes ka sum find karne ke liye code me (root.val / 2) % 3) == 0 check ko replace kar diya jaa sakta hai, 
jo ki grandparent ke value ko 3 ke multiple hone ka check karta hai. Ye isliye work karega kyunki, agar ek number 2 aur 3 dono se divisible hai,
to wo 6 se bhi divisible hoga, jiska value modulo 3 hamesha 0 hoga.


- Kya is solution ki time complexity aur space complexity kya hai? Kya is code ko optimize kiya ja sakta hai?

Solution ki time complexity O(n) hai, jahaan n binary tree ke nodes ki sankhya hai, kyunki hum har ek node ko ek baar visit karte hai. Space complexity O(h) hai, 
jahaan h binary tree ki height hai, kyunki recursion ki maximum depth binary tree ki height se equal hoti hai. Is solution ko optimize karne ke liye, hum recursion ke bajay iterative approach ka use kar sakte hai, jo space complexity ko O(1) me reduce kar dega.
Is code ko test karne ke liye, hum kaise test cases create kar sakte hai?


- Kya koi scenario ho sakta hai jisme ye code even-valued grandparents wale nodes ka sum sahi se calculate na kare?

Ek scenario jisme ye code sahi se calculate na kare, wo hai jab binary tree me 2 se jyada levels ho, lekin sirf dusre level ke nodes ke even-valued grandparents ho.
Is case me, humara code sirf third level ke nodes ke even-valued grandparents ka sum calculate karega, lekin dusre level ke nodes ka sum nahi karega.
Isliye, hume is scenario me code me modification ki jarurat hogi jisse dusre level ke nodes ke even-valued grandparents ka bhi sum calculate kiya jaye.



- Agar binary tree ke kisi node ka value negative hai to kya koi issue ho sakta hai?

Nahi, binary tree ke kisi node ka value negative hone se koi issue nahi hoga kyunki isme sirf node values ka sum calculate kiya ja raha hai aur
isse koi fark nahi padega ki node ka value positive hai ya negative.


- Agar binary tree me koi node multiple parents ka hai to kya koi issue ho sakta hai?

Binary tree ka definition ye hai ki har node ka maximum 2 children hote hai aur ek parent hota hai, isliye binary tree me koi node multiple parents ka nahi ho sakta.
Agar aisa hota hai to woh binary tree nahi hai aur is problem ka solution bhi binary tree par based nahi ho sakta.
