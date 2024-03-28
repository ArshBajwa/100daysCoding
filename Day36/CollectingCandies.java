package amcat;
import java.util.*;
public class CollectingCandies {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            int sum=0;
            Arrays.sort(a);
            int k=0;
            int s1[]=new int[n];
            for(int i=0;i<n;i++){
                sum=sum+a[i];
                s1[k]=sum;
                k++;
                
            }
            int sumi=0;
            for(int i=1;i<s1.length;i++){
                sumi+=s1[i];
            }
            System.out.println(sumi);

        }

    }
    
}
