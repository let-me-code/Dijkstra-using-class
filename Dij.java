import java.util.*;
public class Dij {
    public static void main(String [] arg){
        Scanner scan= new Scanner(System.in);
        int n=5,inf=999;
        //int distance[]=new int[5];
        //int sptset []=new int[5];
        int visited []=new int[5];
        int v=0;
        int graph [][]=new int[n][n];
        for(int i=0;i<n;i++){
            //sptset[i]=0;
            //visited[i]=0;
            for(int j=0;j<n;j++){
                graph[i][j]=scan.nextInt();
                if(graph[i][j]<=0)
                    graph[i][j]=inf;
            }
        }

       for(int i=0;i<5;i++){
            visited=new int[]{0,0,0,0,0,0};
            Dijkstras.func(graph,i,visited);
       }

    }
}
