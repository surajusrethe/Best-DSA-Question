class Solution {

    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root)
    {
        post(root);
        return list;
    }

   void post(TreeNode root)
   {
       if(root == null) return;

       post(root.left);
       post(root.right);
       list.add(root.val);
   }
}
