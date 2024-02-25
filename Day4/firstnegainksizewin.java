package slidingWindow;

import java.util.*;

public class firstnegainksizewin {
    public static int [] nega(int []a,int k,int n){
        int ans[]=new int[n];
        List<Integer>l=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<n){
            if(a[j]<0){
                l.add(a[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(l.isEmpty()){
                    ans[i]=0;
                }
                else{
                    if(a[i]==l.get(0)){
                        ans[i]=l.get(0);
                        l.remove(0);
                    }
                    else{
                        ans[i]=l.get(0);
                    }
                }
                i++;
                j++;
            }   
        }
  return ans;
   }
    public static void main(String[] args) {
        
Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int k=s.nextInt();
        int ans[]=nega(a, k, n);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }

    
}
}
