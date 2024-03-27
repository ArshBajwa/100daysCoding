package amcat;

import java.util.*;

public class distictele {
    public static void main(String[] args) {
        int []a1={1,2,3,4,5};
        int []a2={2,6,8,10};
        Set<Integer>s=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int e:a1){
            s.add(e);
        }
        for(int e:a2){
            s2.add(e);
        }
        Set<Integer>s1=new HashSet<>(s);
        s.removeAll(s2);
        s2.removeAll(s1);  
        System.out.print(s);
        System.out.print(s2);
        System.out.print(s.size()+s2.size());
    }
    
}
