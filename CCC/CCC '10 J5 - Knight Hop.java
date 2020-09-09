import java.util.*;
import java.io.*;
public class KnightHop {
static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static boolean visited[][] = new boolean[9][9];
    static int[] distance = new int[89];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int xStart = readInt();
        int yStart = readInt();
        int xFinal = readInt();
        int yFinal = readInt();
        BFS(xStart, yStart, xFinal, yFinal);
        System.out.println(distance[xFinal*10+yFinal]);
    }
    static void BFS(int xStart, int yStart, int xFinal, int yFinal) {
    	int curX;
    	int curY;
    	Queue<Integer> q = new LinkedList<>();
    	q.add(xStart);
    	q.add(yStart);
    	while (!q.isEmpty()) {
    		curX = q.poll();
    		curY = q.poll();
    		if (curX == xFinal && curY == yFinal)
    			break;
    		if (!visited[curX][curY]) {
    			//X moves 2 section
    			if (curX + 2 <= 8 && curY + 1 <= 8) {
    				q.add(curX+2);
    				q.add(curY+1);
    				distance[(curX+2)*10+curY+1] = distance[curX*10+curY]+1;
    			}
    			if (curX + 2 <= 8 && curY - 1 >= 1) {
    				q.add(curX+2);
    				q.add(curY-1);
    				distance[(curX+2)*10+curY-1] = distance[curX*10+curY]+1;
    			}
    			if (curX - 2 >= 1 && curY + 1 <= 8) {
    				q.add(curX-2);
    				q.add(curY+1);
    				distance[(curX-2)*10+curY+1] = distance[curX*10+curY]+1;
    			}
    			if (curX - 2 >= 1 && curY - 1 >= 1) {
    				q.add(curX-2);
    				q.add(curY-1);
    				distance[(curX-2)*10+curY-1] = distance[curX*10+curY]+1;
    			}
    			// Y moves 2 section
    			if (curX + 1 <= 8 && curY + 2 <= 8) {
    				q.add(curX+1);
    				q.add(curY+2);
    				distance[(curX+1)*10+curY+2] = distance[curX*10+curY]+1;
    			}
    			if (curX + 1 <= 8 && curY - 2 >= 1) {
    				q.add(curX+1);
    				q.add(curY-2);
    				distance[(curX+1)*10+curY-2] = distance[curX*10+curY]+1;
    			}
    			if (curX - 1 >= 1 && curY + 2 <= 8) {
    				q.add(curX-1);
    				q.add(curY+2);
    				distance[(curX-1)*10+curY+2] = distance[curX*10+curY]+1;
    			}
    			if (curX - 1 >= 0 && curY - 2 >= 1) {
    				q.add(curX-1);
    				q.add(curY-2);
    				distance[(curX-1)*10+curY-2] = distance[curX*10+curY]+1;
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
