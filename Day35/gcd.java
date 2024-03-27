package amcat;

public class gcd {
    public static void main(String[] args) {
        
        int a=12;
        int b=8;
        int g=0;
        for(int i=1;i<=a&&i<=b;i++){
            if((b%i==0)&&(a%i==0)){
                g=i;

            }
        }
        System.out.println(g);
    }
    
}
