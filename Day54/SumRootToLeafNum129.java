class Solution {
    public static int sum(TreeNode root,int sum){
        if(root==null)return 0;
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null)return sum;
        int lsum=sum(root.left,sum);
        int rsum=sum(root.right,sum);
        return lsum+rsum;
    }
    public int sumNumbers(TreeNode root) {
       return sum(root,0);
        
    }
}