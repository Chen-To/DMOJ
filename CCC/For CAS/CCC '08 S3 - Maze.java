import java.util.*;
import java.io.*;
public class CCCS308_Maze {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static char map[][] = new char [20][20];
    static int x,y;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int cases = readInt();
        for (int i = 0; i < cases; i ++) {
        	y = readInt();
        	x = readInt();
        	for (int len = 0; len < y; len ++) {
        		String holder = readLine();
        		for (int wid = 0; wid < x; wid ++) {
        			map[wid][len] = holder.charAt(wid);
        		}
        	}
        	System.out.println(BFS());
        }
    }
    static int BFS() {
    	boolean up, down, left, right;
    	int distance[][] = new int [x][y];
    	distance[0][0] = 1;
    	Queue<Pair> q = new LinkedList<Pair>();
    	Pair start = new Pair(0,0);
    	q.add(start);
    	while(!q.isEmpty()) {
    		up = false;
    		down = false;
    		left = false;
    		right = false;
    		Pair curr = q.poll();
    		int curX = curr.x;
    		int curY = curr.y;
    		if (curX == x-1 && curY == y-1)
    			return distance[x-1][y-1];
    		if (map[curX][curY] == '+') {
    			up = true;
    			down = true;
    			left = true;
    			right = true;
    		}
    		else if (map[curX][curY] == '-') {
    			left = true;
    			right = true;
    		}
    		else if (map[curX][curY] == '|') {
    			up = true;
    			down = true;
    		}
    		//Go Left
    		if (left && curX-1 >= 0 && distance[curX-1][curY] == 0 && map[curX-1][curY] != '*') {
				Pair p = new Pair(curX-1, curY);
				q.add(p);
				distance[curX-1][curY] = distance[curX][curY] + 1;
			}
    		//Go Right
    		if (right && curX+1 < x && distance[curX+1][curY] == 0 && map[curX+1][curY] != '*') {
				Pair p = new Pair(curX+1, curY);
				q.add(p);
				distance[curX+1][curY] = distance[curX][curY] + 1;
			}
    		//Go up
    		if (up && curY-1 >= 0 && distance[curX][curY-1] == 0 && map[curX][curY-1] != '*') {
				Pair p = new Pair(curX, curY-1);
				q.add(p);
				distance[curX][curY-1] = distance[curX][curY] + 1;
			}
    		//Go Down
    		if (down && curY+1 < y && distance[curX][curY+1] == 0 && map[curX][curY+1] != '*') {
				Pair p = new Pair(curX, curY+1);
				q.add(p);
				distance[curX][curY+1] = distance[curX][curY] + 1;
			}
    	}
    	return -1;
    	
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
    	int x, y;
    	public Pair(int x, int y) {
    		this.x = x;
    		this.y = y;
    	}
    }
}
