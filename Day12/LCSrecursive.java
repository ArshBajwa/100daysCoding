package Dp;

import java.util.Scanner;

public class LCSrecursive {
    public static int lcs(String x,String y,int i,int j){
        if(i<0||j<0)return 0;
        if(x.charAt(i)==y.charAt(j)){
            return 1+lcs(x, y, i-1, j-1);
        }
        else{
            return Math.max(lcs(x,y,i,j-1),lcs(x, y, i-1, j));
        }
    }
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       String x=s.nextLine();
       String y=s.nextLine();
       int n=x.length();
       int m=y.length();
       System.out.println(lcs(x, y, n-1, m-1));

    }
}
