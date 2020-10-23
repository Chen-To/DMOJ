import java.util.*;
import java.io.*;
public class CCC09S4_Matrix {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int graph[][];
    static int cities;
    static int dist[];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        cities = readInt();
        int routes = readInt();
        ArrayList<Pair> costs = new ArrayList<Pair>();
        graph = new int [cities+1][cities+1];
        for (int i = 0; i < routes; i ++) {
        	int city1 = readInt();
        	int city2 = readInt();
        	int cost = readInt();
        	graph[city1][city2] = cost;
        	graph[city2][city1] = cost;
        }
        int num = readInt();
        for (int k = 0; k < num; k ++) {
        	int city = readInt();
        	int cost = readInt();
        	Pair temp = new Pair (city, cost);
        	costs.add(temp);
        }
        int dest = readInt();
        dijkstra(dest);
        int min = Integer.MAX_VALUE;
        for (int m = 0; m < num; m ++) {
        	Pair test = costs.get(m);
        	int store = test.y+dist[test.x];
        	if (store < min)
        		min = store;
        }
        System.out.println(min);
    }
    static void dijkstra(int dest) {
    	dist = new int[cities+1];
    	PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
    	Pair start = new Pair (dest,0);
    	pq.add(start);
    	dist[dest] = 0;
    	while (!pq.isEmpty()) {
    		Pair curr = pq.poll();
    		int cur = curr.x;
    		for (int i = 1; i <= cities; i ++) {
    			if (i != dest && graph[cur][i] != 0 && dist[i] == 0) {
    				dist[i] = dist[cur] + graph[cur][i];
    				pq.add(new Pair (i, dist[i]));
    			}
    			else if (graph[cur][i] != 0 && dist[i] > dist[cur] + graph[cur][i]) {
    				dist[i] = dist[cur] + graph[cur][i];
    				pq.add(new Pair (i, dist[i]));
    			}
    		}
    	}
    }
    static String next () throws IOException {
        while (st == null || !st.hasMoreTokens())
        st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
 
    static long readLong () throws IOException {
        return Long.parseLong(next());
    }
 
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
 
    static double readDouble () throws IOException {
        return Double.parseDouble(next());
    }
 
    static char readCharacter () throws IOException {
        return next().charAt(0);
    }
 
    static String readLine () throws IOException {
        return br.readLine().trim();
    }
    static class Pair implements Comparable<Pair>{
    	int x, y;
    	public Pair(int x, int y){
    		this.x = x;
    		this.y = y;
    	}
    	public int compareTo(Pair other) {
    		return Integer.compare(y,other.y);
    	}
    }
}
