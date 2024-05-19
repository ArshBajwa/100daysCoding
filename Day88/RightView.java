class Solution {
    public static List<Integer> solve(TreeNode root,int level,List<Integer>al){
        if(root==null)return al;
        if(al.size()==level){
             al.add(root.val);
        }
        solve(root.right,level+1,al);
        solve(root.left,level+1,al);
        return al;
    }
    public List<Integer> rightSideView(TreeNode root) {
          List<Integer>al=new ArrayList<>();
          return solve(root,0,al);

    }
}