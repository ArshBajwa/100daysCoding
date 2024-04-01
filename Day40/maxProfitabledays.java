package st;
import java.util.*;
public class maxProfitabledays {
    public static void main(String[] args) {
            
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int si=0;
        int e=0;
        int temp=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum>max){
                max=sum;
                si=temp;
                e=i;
            }
            if(sum<0){
                sum=0;
                temp=i+1;
            }
        
    }
    System.out.println(si+" "+e);
    
}
}
