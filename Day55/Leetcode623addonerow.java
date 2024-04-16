class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode n=new TreeNode(val);
            n.left=root;
            return n;
        }
        d(root,1,depth,val);
        return root;
                
    }
    public void d(TreeNode root,int currdep,int depth,int val){
        if(root==null)return;
        if(currdep<depth-1){
            d(root.left,currdep+1,depth,val);
            d(root.right,currdep+1,depth,val);
        }
        if(currdep==depth-1){
            TreeNode exlef=root.left;
            TreeNode exrig=root.right;
            TreeNode newlef=new TreeNode(val);
            TreeNode newrig=new TreeNode(val);
            root.left=newlef;
            newlef.left=exlef;
            root.right=newrig;
            newrig.right=exrig;
        }



    }
}