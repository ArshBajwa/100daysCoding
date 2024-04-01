package st;
import java.util.*;
public class DeliveryTrucks {
    public static ArrayList<Integer> truck(int []a,int n,int k){
        int i=0;
        int j=0;
        ArrayList<Integer>al=new ArrayList<>();
        HashMap<Integer,Integer>mp=new HashMap<>();
        while(j<n){
            mp.put(a[j],mp.getOrDefault(a[j],0)+1);
             if(j-i+1<k){
                j++;
             }
             else if(j-i+1==k){
                al.add(mp.size());
                j++;
                if(mp.containsKey(a[i])){
                    mp.put(a[i],mp.get(a[i])-1);
                }
                if(mp.get(a[i])==0){
                    mp.remove(a[i]);
                }
                 i++;
             }
         
        }
        return al;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        System.out.println(truck(a, n, k));



        
    }
    
}
