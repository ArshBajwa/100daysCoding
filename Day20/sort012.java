import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int curr=0;
        int zero=0;
        int twopos=arr.length-1;
        while(curr<=twopos){
            if(arr[curr]==0){
               int temp=arr[curr];
               arr[curr]=arr[zero];
               arr[zero]=temp;
                curr++;
                zero++;
            }
            else if(arr[curr]==2){
                int temp=arr[curr];
                arr[curr]=arr[twopos];
                arr[twopos]=temp;
                twopos--;
            }
            else{
                curr++;
            }
        }
    }
   
}