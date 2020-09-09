import java.util.*;
import java.io.*;
public class Wand {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static boolean visited[];
    static ArrayList<Integer>[] adj;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int wizs = readInt();
        int duels = readInt();
        visited = new boolean[wizs+1];
        adj = new ArrayList[wizs+1];
        for (int k = 1; k <= wizs; k ++ ) {
        	adj[k] = new ArrayList<>();
        }
        for (int i = 1; i <= duels; i ++) {
        	int won = readInt();
        	int lost = readInt();
        	adj[lost].add(won);
        }
        bfs();
        for (int l = 1; l < visited.length; l ++) {
        	if (visited[l])
        		System.out.print("1");
        	else if (l == 1 && adj[l].size() == 0)
        		System.out.print("1");
        	else
        		System.out.print("0");
        }
    }
    static void bfs() {
    	Queue<Integer> q = new LinkedList<>();
    	q.add(1);
    	while(!q.isEmpty()) {
    		int wiz = q.poll();
    		for (int i = 0; i < adj[wiz].size(); i ++) {
    			int temp = adj[wiz].get(i);
    			if(!visited[temp]) {
    				q.add(temp);
    				visited[temp] = true;
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
}
