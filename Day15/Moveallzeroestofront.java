package classWork;
import java.util.*;
public class Moveallzeroestofront {
    public static void movezeroes(int []a){
        int i=a.length-1;
        for(int j=a.length-1;j>=0;j--){
            if(a[j]!=0){
                swap(a,i,j);
                i--;    
            }
        }
    }
    
    public static void swap(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        movezeroes(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }
    
}
