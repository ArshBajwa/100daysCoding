package amcat;
import java.util.*;
public class classMonitor {
    public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        int n=6;
        int a[]={4,3,7,2,6,1};
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    
}
