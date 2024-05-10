class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingDouble(a->(double)a[0]/a[1]));
          for(int i=0;i<arr.length-1;i++){
             for(int j=1;j<arr.length;j++){
                 pq.offer(new int[]{arr[i],arr[j]});
             }
          }
          int []result=new int[2];
          for(int i=0;i<k;i++){
               result=pq.poll();
          }
          return result;
          
              }
}