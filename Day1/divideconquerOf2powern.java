package classWork;
import java.util.*;
public class divideconquerOf2powern{
    public static int divideAndCon(int x,int power){
        if(power==0){
            return 1;
        }
        if(power==1){
            return x;
        }
        int k=divideAndCon(x, power/2);
        if(power%2==0){
            return k*k;
        }
        else{
            return x*k*k;
        }
    }
    public static void main(String[] args) {
        System.out.println(divideAndCon(2, 4));

        
    }


}