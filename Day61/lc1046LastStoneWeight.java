class Solution {
    public int lastStoneWeight(int[] stones) {
         PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
         for(int e:stones){
            pq.offer(e);
         }
         while(pq.size()>1){
             int max=pq.poll();
             int secmax=pq.poll();
             int diff=max-secmax;
             if(diff>0){
                pq.offer(diff);
             }
         }
         if(pq.isEmpty()){
            return 0;
         }
         return pq.peek();
    }
}