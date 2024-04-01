package st;
import java.util.*;
public class analyzetemp {
    public static int sumi(int a[],int n,int w){
        int i=0;
        int j=0;
        int sum=0;
         
         while(j<n){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
             if(j-i+1<w){
                j++;
             }
             else if(j-i+1==w){
                for(int k=i;k<=j;k++)
             {
                min=Math.min(min,a[k]);
                max=Math.max(max,a[k]);
             }
                  sum+=min+max;
                  j++;   
                  i++;   
             }
           
         }
        return sum;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int w=s.nextInt();
        System.out.print(sumi(a, a.length, w));
        
        
    }
    
}
