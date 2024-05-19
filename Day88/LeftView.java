class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer>al=new ArrayList<>();
      return solve(root,0,al);
      
    }
    ArrayList<Integer> solve(Node root, int level, ArrayList<Integer>al){
        if(root==null)return al;
    if(al.size()==level)
{
    al.add(root.data);
}            
solve(root.left,level+1,al);
solve(root.right,level+1,al);
return al;
    }
}