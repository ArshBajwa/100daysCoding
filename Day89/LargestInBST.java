class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        // Write your code here
        if(root==null)return 0;
        if(isValidBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
              return countNode(root);
        }
        else{
            int l=largestBst(root.left);
            int r=largestBst(root.right);
            return Math.max(l,r);
        }
        
        
    }
    static boolean isValidBST(Node root,int minVal,int maxVal){
        if(root==null)return true;
        if(root.data>=maxVal||root.data<=minVal){
             return false;
        }
        return isValidBST(root.left,minVal,root.data)&&isValidBST(root.right,root.data,maxVal);
         
    }
    static int countNode(Node root){
         if(root==null)return 0;
         return 1+countNode(root.left)+countNode(root.right);
    }
    
    
}