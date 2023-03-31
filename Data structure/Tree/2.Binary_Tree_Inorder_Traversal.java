class Solution 
{
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root)
    {
        inorder(root);
        return list;
    }

     void inorder(TreeNode root)
    {
        if(root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}
