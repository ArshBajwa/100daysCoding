package backtracking;
import java.util.*;
public class ratinmaze1 {
    public static int maze(int sr,int sc,int er,int ec){
        if(sr>er||sc>ec)return 0;
        if(sr==er||sc==ec)return 1;
        int down=maze(sr+1, sc,er,ec);
        int right=maze(sr, sc+1,er,ec);
        return down+right;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        // int maze[][]=new int[r][c];
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         maze[i][j]=s.nextInt();
        //     }
        // }
     System.out.println(maze(1,1,r,c));
        
        
    }
    
}
