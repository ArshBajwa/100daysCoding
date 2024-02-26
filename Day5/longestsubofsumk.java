package slidingWindow;
import java.util.*;
public class longestsubofsumk {
    public static int longsub(int a[],int n,int k){
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(j<n){
            sum+=a[j];
            if(sum<k)j++;
            else if(sum>k){
                while(sum>k&&i>n){
                    sum-=a[i];
                    i++;
                }
                j++;
            }
            else if(sum==k){
                max=Math.max(max,j-i+1);
                j++;
            }
        }
        return max;

    }
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
           int n=s.nextInt();
           int a[]=new int[n];
           for(int i=0;i<n;i++){
            a[i]=s.nextInt();
           }
           int k=s.nextInt();
           System.out.println(longsub(a, n,k));
     }
}
