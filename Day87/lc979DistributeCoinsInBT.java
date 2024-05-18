class Solution {
    private  int moves=0;
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
         int leftbal=dfs(root.left);
         int rightbal=dfs(root.right);
          moves+=Math.abs(leftbal)+Math.abs(rightbal);
          return root.val+leftbal+rightbal-1;
    }
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return moves;
    }
}