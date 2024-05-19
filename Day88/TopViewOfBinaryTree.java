class Solution
{

    static ArrayList<Integer> topView(Node root)
    {
        
        ArrayList<Integer>al=new ArrayList<>();
        Queue<Pair>q=new ArrayDeque();
        Map<Integer,Integer>mp=new TreeMap<>();
        if(root!=null){
             q.add(new Pair(0,root));
        }
        while(q.size()>0){
             Pair temp=q.poll();
             if(!mp.containsKey(temp.hd)){
                 mp.put(temp.hd,temp.node.data);
             }
             if(temp.node.left!=null){
                  q.add(new Pair(temp.hd-1,temp.node.left));
             }
             if(temp.node.right!=null){
                  q.add(new Pair(temp.hd+1,temp.node.right));
             }
        }
        for(Map.Entry<Integer,Integer>en:mp.entrySet()){
              al.add(en.getValue());
        }
        return al;
        
        
    }
    static class Pair{
         int hd;
         Node node;
         public Pair(int hd,Node node){
              this.hd=hd;
              this.node=node;
         }
         
    }
}