class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
          ArrayList<double[]>al=new ArrayList<>();
          for(int i=0;i<quality.length;i++){
               al.add(new double[]{(double)wage[i]/quality[i],(double)quality[i]});
          }
           al.sort(Comparator.comparingDouble(p->p[0]));
          PriorityQueue<Double>pq=new PriorityQueue<>(Collections.reverseOrder());
          double sum=Double.MAX_VALUE;
          double currsum=0;
          for(double []worker:al){
              double ratio=worker[0];
              currsum+=worker[1];
              pq.offer(worker[1]);
              if(pq.size()>k){
                   currsum-=pq.poll();
              }
              if(pq.size()==k){
                    sum=Math.min(sum,currsum*ratio);
              }
          }
          return sum;
        
    }
}