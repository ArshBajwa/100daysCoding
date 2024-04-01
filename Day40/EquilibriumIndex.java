package st;
import java.util.*;


public class EquilibriumIndex {
    public static int equ(int []a,int n){
        int mid=a.length/2;
        int leftsum=sum(a,0,mid);
        int rightsum=sum(a,mid+1,n);
        if(leftsum==rightsum){
            return mid;
        }
        return -1;

    }
    public static int sum(int []a,int i,int j){
        int sum=0;
        for(int k=i;k<j;k++){
            sum+=a[k];
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
        System.out.println(equ(a, n));


        
        
    }
    
}
