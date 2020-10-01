import java.util.*;
import java.io.*;
public class DMPOC13_AFK {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int wid, len, startX, startY, washX, washY;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int cases = readInt();
        for (int i = 0; i < cases; i ++) {
        	wid = readInt();
        	len = readInt();
        	char map[][] = new char[wid][len];
        	for (int l = 0; l < len; l ++) {
        		String holder = readLine();
	        	for (int w = 0; w < wid; w ++) {
	        		char x = holder.charAt(w);
	        		map[w][l] = x;
	        		if (x == 'C') {
	        			startX = w;
	        			startY = l;
	        		}
	        		else if (x == 'W') {
	        			washX = w;
	        			washY = l;
	        		}
	        	}
        	}
        	int dist = BFS(map);
        	if (dist < 60 && dist != 0)
        		System.out.println(dist);
        	else
        		System.out.println("#notworth");
        }
        
    }
    static int BFS(char map [][]) {
    	int distance[][] = new int [wid][len];
    	boolean visited[][] = new boolean [wid][len];
    	Queue<Pair> q = new LinkedList<Pair>();
    	Pair start = new Pair(startX, startY);
    	q.add(start);
    	visited[start.x][start.y] = true;
    	while(!q.isEmpty()) {
    		Pair curr = q.poll();
    		if(curr.x == washX && curr.y == washY) 
    			break;
    		else if (distance[curr.x][curr.y] >= 60)
    			return 61;
    		//Go down
    		if (curr.y+1 <= len-1 && !visited[curr.x][curr.y+1]) {
    			if (map[curr.x][curr.y+1] != 'X') {
	    			Pair child = new Pair(curr.x, curr.y+1);
	    			q.add(child);
	    			visited[curr.x][curr.y+1] = true;
	    			distance[curr.x][curr.y+1] = distance[curr.x][curr.y] + 1;
    			}
    		}	
    		//Go up
    		if (curr.y-1 >= 0 && !visited[curr.x][curr.y-1]) {
    			if (map[curr.x][curr.y-1] != 'X') {
	    			Pair child = new Pair(curr.x, curr.y-1);
	    			q.add(child);
	    			visited[curr.x][curr.y-1] = true;
	    			distance[curr.x][curr.y-1] = distance[curr.x][curr.y] + 1;
    			}
    		}	
    		//Go right
    		if (curr.x+1 <= wid-1 && !visited[curr.x+1][curr.y]) {
    			if (map[curr.x+1][curr.y] != 'X') {
	    			Pair child = new Pair(curr.x+1, curr.y);
	    			q.add(child);
	    			visited[curr.x+1][curr.y] = true;
	    			distance[curr.x+1][curr.y] = distance[curr.x][curr.y] + 1;
    			}
    		}	
    		//Go left
    		if (curr.x-1 >= 0 && !visited[curr.x-1][curr.y]) {
    			if (map[curr.x-1][curr.y] != 'X') {
	    			Pair child = new Pair(curr.x-1, curr.y);
	    			q.add(child);
	    			visited[curr.x-1][curr.y] = true;
	    			distance[curr.x-1][curr.y] = distance[curr.x][curr.y] + 1;
    			}
    		}
    	}
    	return distance[washX][washY];
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
    static class Pair{
    	int x;
    	int y;
    	public Pair(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
}
