import java.util.*;
import java.io.*;
public class CanShairEven {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static boolean visited[];
    static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int nodes = readInt();
        int edges = readInt();
        int start = readInt();
        int end = readInt();
        visited = new boolean[nodes+1];
        for (int i = 1; i <= nodes; i ++)
        	graph.put(i, new LinkedList<Integer>());
        for (int k = 0; k < edges; k ++) {
        	int x = readInt();
        	int y = readInt();
        	graph.get(x).add(y);
        	graph.get(y).add(x);
        }
        if (start == end) {
        	System.out.print("GO SHAHIR!");
        	return;
        }
        else
        	bfs(start,end);
        if (visited[end])
        	System.out.print("GO SHAHIR!");
        else
        	System.out.println("NO SHAHIR!");
        
    }
    public static void bfs(int start, int end) {
    	Queue<Integer> q = new LinkedList<>();
    	int curr;
    	q.add(start);
    	while(!q.isEmpty()) {
    		curr = q.poll();
    		if (curr == end) {
    			visited[end] = true;
    			break;
    		}
    		if (!visited[curr]) {
    			visited[curr] = true;
    			for(int i = 0; i <  graph.get(curr).size(); i ++) {
    				q.add(graph.get(curr).get(i));
    			}
    		}
    	}
    	return;
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
}
