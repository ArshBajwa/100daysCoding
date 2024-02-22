package backtracking;

public class ratindeadmaze2dir {
    public static void maze(int sr,int sc,int er,int ec,int maze[][],String s){
                if(sr>er||sc>ec)return;
                if(sr<0||sc<0)return;
                if(maze[sr][sc]==0)return;
                if(sr==er&&sc==ec){
                    System.out.println(s);
                    return;
                }
                maze(sr+1, sc, er, ec, maze,s+"D");
                maze(sr, sc+1, er, ec, maze, s+"R");


    }
    public static void main(String[] args) {
        int r=3;
        int c=4;
        int maze[][]={
            {1,0,1,1},
            {1,1,1,1},
            {1,1,0,1}
        };
        maze(0,0,r-1,c-1,maze,"");
        
    }
    
}
