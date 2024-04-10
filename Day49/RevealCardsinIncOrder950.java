class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        ArrayList<Integer>al=new ArrayList<>();
        Deque<Integer>q=new LinkedList<>();
        Arrays.sort(deck);
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        int a[]=new int[n];
        for(int c:deck){
            a[q.poll()]=c;
            if(!q.isEmpty()){
                q.addLast(q.poll());
            }
        }
        return a;
        
         
    }
}
