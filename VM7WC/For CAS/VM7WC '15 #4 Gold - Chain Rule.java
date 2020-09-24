import java.util.*;
import java.io.*;
public class DijkstraPracticeChainRule {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static ArrayList<Pair>[] adj;
    static int dist[];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int cities = readInt();
        int highways = readInt();
        adj = new ArrayList[cities];
        dist = new int[cities];
        for (int k = 0; k < adj.length; k ++)
        	adj[k] = new ArrayList<Pair>();
        for (int i = 0; i < highways; i ++) {
        	int city1 = readInt();
        	int city2 = readInt();
        	int dist = readInt();
        	Pair temp1 = new Pair(city2, dist);
        	Pair temp2 = new Pair (city1, dist);
        	adj[city1].add(temp1);
        	adj[city2].add(temp2);
       }
        dijkstra(0);
        int max = dist[cities-1];
        int org[] = Arrays.copyOf(dist,cities);
        dijkstra(cities-1);
        for (int l = 1; l < cities-1; l ++) {
        	if (org[l] + dist[l] > max)
        		max = org[l] + dist[l];
        }
        System.out.println(max);
        
        
    }
    static void dijkstra(int start) {
    	PriorityQueue<Pair> q = new PriorityQueue<Pair>();
    	Arrays.fill(dist, Integer.MAX_VALUE);
    	dist[start] = 0;
    	q.add(new Pair(start, dist[start]));
    	while(!q.isEmpty()) {
    		Pair curr = q.poll();
    		for (int i = 0; i < adj[curr.node].size(); i ++) {
    			Pair child = new Pair(adj[curr.node].get(i).node,adj[curr.node].get(i).distance);
    			if (child.distance + dist[curr.node] < dist[child.node]) {
    				q.add(child);
    				dist[adj[curr.node].get(i).node] = child.distance+dist[curr.node];
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
    	int node, distance;
    	public Pair(int node, int distance) {
    		this.node = node;
    		this.distance = distance;
    	}
    	public int compareTo(Pair other) {
    		return Integer.compare(distance,other.distance);
    	}
    }
}
