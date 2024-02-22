package backtracking;

public class ratindeadmaze4dir {
    public static void maze(int sr,int sc,int er,int ec,int maze[][],String s,boolean[][]isvisited){
                if(sr>er||sc>ec)return;
                if(sr<0||sc<0)return;
                if(maze[sr][sc]==0)return;
                if(isvisited[sr][sc])return;
                if(sr==er&&sc==ec){
                    System.out.println(s);
                    return;
                }       
                isvisited[sr][sc]=true;
                maze(sr+1, sc, er, ec, maze,s+"D",isvisited);
                maze(sr, sc+1, er, ec, maze, s+"R",isvisited);
                maze(sr, sc-1, er, ec, maze, s+"L",isvisited);
                maze(sr-1, sc, er, ec, maze, s+"U",isvisited);
                isvisited[sr][sc]=false;

    }
    public static void main(String[] args) {
        int r=3;
        int c=4;
        int maze[][]={
            {1,0,1,1},
            {1,1,1,1},
            {1,1,0,1}
        };
        boolean [][]isvisited=new boolean[r][c];
        maze(0,0,r-1,c-1,maze,"",isvisited);
        
    }
    
}

