
/*************************************************************************NOTES******************************************************************************************/
/*
- Linked lists are Linear, dynamic data structure, which means that the size of the list can change at runtime by adding or removing nodes.

- Each node contains two components: the data that the node holds, and a reference to the next node in the list.
  The first node in the list is called the head, while the last node is called the tail.
  
-  There are two main types of linked lists: singly linked lists and doubly linked lists. In a singly linked list, each node only has a reference to the next node in the list. In a doubly linked list, each node has a reference to both the next and previous nodes in the list.

Basic Operations and TC:

- Insertion: he time complexity for insertion is O(1) if inserting at the beginning or O(n) if inserting at any other position.
- Deletion: The time complexity for deletion is O(1) if deleting from the beginning or O(n) if deleting from any other position.
- Traversal: The time complexity for traversal is O(n).
- Searching: The time complexity for searching is O(n).

*/


/*************************************************************************Question******************************************************************************************/

/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

*/

/*************************************************************************APPROACH******************************************************************************************/

/*

- Initialize two pointers, prev and current, to null and head respectively.
- Traverse the linked list from head to null, and at each node:

a. Store the next node in the list in next.
b. Reverse the pointer to the previous node by setting current.next to prev.
c. Move prev to current and current to next.

- Return prev as the new head of the reversed linked list.
*/

/*************************************************************************CODE***********************************************************************************/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;      // initialize prev to null
        ListNode current = head;   // start with the head of the list
    
        while(current != null) {   // loop until the end of the list
            ListNode next = current.next; // store the next node in the list
            current.next = prev;    // reverse the pointer to the previous node
            prev = current;         // move prev to the current node
            current = next;         // move current to the next node
        }
        
        return prev;               // return the head of the reversed list
    }
}


/*************************************************************************DRY RUN******************************************************************************************/

/*
Input:  1 -> 2 -> 3 -> null

Step 1: Initialize prev and current pointers
        prev = null
        current = 1

Step 2: Traverse the linked list and reverse pointers
        a. At node 1:
            next = 2
            current.next = null
            prev = 1
            current = 2
        b. At node 2:
            next = 3
            current.next = prev
            prev = 2
            current = 3
        c. At node 3:
            next = null
            current.next = prev
            prev = 3
            current = null

Step 3: Return the new head of the reversed linked list (prev)
        Output: 3 -> 2 -> 1 -> null

*/

