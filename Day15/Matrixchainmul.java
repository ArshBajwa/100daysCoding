package Dp;
import java.util.*;
public class Matrixchainmul {
    public static int mul(int a[],int i,int j){
        if(i>=j)return 0;
        int min=Integer.MAX_VALUE;
       
        for(int k=i;k<=j-1;k++){
             int temp=mul(a, i, k)+mul(a, k+1, j)+a[i-1]*a[k]*a[j];
        
        min=Math.min(min, temp);
        }
        return min;
    }
public static void main(String[] args) {
    int a[]={40,20,30,10,30};
    System.out.println(mul(a, 1, a.length-1));
}
    
}
