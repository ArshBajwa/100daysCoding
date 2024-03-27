package amcat;

public class noofpossibletriplets {
    public static void main(String[] args) {
        int a[]={3,4,6,7};
        int cnt=0;
        for(int i=0;i<a.length-2;i++){
            for(int j=i+1;j<a.length-1;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]>a[k]){
                        cnt++;
                    }
                }
            }

        }
       System.out.println(cnt);        
    }
    
}
