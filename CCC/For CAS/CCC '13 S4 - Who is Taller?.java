import java.util.*;
import java.io.*;
public class CCC13S3WhoIsTaller {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int people = readInt();
        int pairs = readInt();
        adj = new ArrayList [people+1];
        for (int i = 0; i < pairs; i ++) {
        	int taller = readInt();
        	int shorter = readInt();
        	if (adj[taller] == null)
        		adj[taller] = new ArrayList<Integer>();
        	adj[taller].add(shorter);
        }
        int p = readInt();
        int q = readInt();
        if (BFS(p,q))
        	System.out.println("yes");
        else if (BFS(q,p))
        	System.out.println("no");
        else
        	System.out.println("unknown");
    }
    static boolean BFS(int start, int end) {
    	Queue<Integer> q = new LinkedList<Integer>();
    	boolean visited[] = new boolean[adj.length];
    	q.add(start);
    	visited[start] = true;
    	while(!q.isEmpty()) {
    		int curr = q.poll();
    		ArrayList<Integer> kids = adj[curr];
    		if (kids == null)
    			continue;
    		for (int i : kids) {
    			if (!visited[i]) {
    				visited[i] = true;
    				q.add(i);
    			}
    		}
    		if (visited[end])
    			return true;
    	}
    	return false;
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
