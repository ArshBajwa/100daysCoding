package amcat;
import java.util.*;
public class maximizeProfitaftersellingTick {
    public static void main(String[] args) {
        int seats[]={2,3,4,5,1};
        int n=6;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<seats.length;i++){
            pq.add(seats[i]);
        }
        int ticketsSold=0;
        int ans=0;
        while(n>ticketsSold&&pq.peek()>0){
            ans+=pq.peek();
            int temp=pq.peek();
            pq.poll();
            pq.add(temp-1);
            ticketsSold++;
        }
        System.out.println(ans);

        
    }
    
}
