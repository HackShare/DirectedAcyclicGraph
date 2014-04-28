/**
 * 
 */
package dagshortestpath;

import graphs.Graph;

import java.util.Scanner;

/**
 * @author Dany
 *
 *
 *
 *DAG-SHORTEST-PATHS(G, w, s)
      topologically sort the vertices of G
      INITIALIZE-SINGLE-SOURCE(G, s)
      for each vertex u taken in the topological sorted order
         do for each vertex v in Adj[u]
            do RELAX(u, v, w)

 */
public class DAGShortestPath {

	/**
	 * @param args
	 */
	public static boolean[] visited;
	public static int[] parent;
	public static int noOfVertices,noOfEdges;
	public static Graph graph=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void constructGraph()
	{

		
		int u, v, w;
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			noOfVertices=scanner.nextInt();
			noOfEdges=scanner.nextInt();
			
			//For the next function 'doDepthFirstSearch'
			visited=new boolean[noOfVertices+1];
			parent=new int[noOfVertices];
			
			
			graph=new Graph(noOfVertices);
			for(int i=0;i<noOfEdges;i++)
			{
				u=scanner.nextInt();
				v=scanner.nextInt();
				w=scanner.nextInt();
				graph.addEdge(u, v, w);
				graph.addEdge(v, u, w);
			}
			break;
		}
		graph.printGraph();

	
	}
	
	

}
