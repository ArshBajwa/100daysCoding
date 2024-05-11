class FreqStack {
    private HashMap<Integer,Integer>mp;
    private HashMap<Integer,Stack<Integer>>gp;
    private int maxfreq=0;
    public FreqStack() {
       mp=new HashMap<>();
       gp=new HashMap<>();
    }
    
    public void push(int val) {
         int f=mp.getOrDefault(val,0)+1;
          mp.put(val,f);
         if(f>maxfreq){
             maxfreq=f;
         }
         Stack<Integer>st=gp.getOrDefault(f,new Stack<Integer>());
         st.push(val);
         gp.put(f,st);
        
    }
    
    public int pop() {
         int x=gp.get(maxfreq).pop();
         mp.put(x,mp.get(x)-1);
         if(gp.get(maxfreq).size()==0){
            gp.remove(maxfreq);
            maxfreq--;
         }
        return x;
    }
}