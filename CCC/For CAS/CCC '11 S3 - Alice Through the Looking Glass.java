import java.util.*;
import java.io.*;
public class CCC2011S3Alice {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int x, y, mag;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int req = readInt();
        for (int i = 0; i < req; i ++) {
        	mag = readInt();
        	x = readInt();
        	y = readInt();
        	if(recurse(1,0,0))
        		System.out.println("crystal");
        	else 
        		System.out.println("empty");
        }
    }
    public static boolean recurse(int start, int curX, int curY) {
    	//Checks Bottom Layer
    	if(x >= Math.pow(5, mag-start)+curX && x <= Math.pow(5, mag-start)*4-1+curX && y <= Math.pow(5, mag-start)-1+curY)
    		return true;
    	//Checks the second layer middle quadrant
    	if (x >= Math.pow(5, mag-start)*2+curX && x <= Math.pow(5, mag-start)*3-1+curX && y <= Math.pow(5, mag-start)*2-1+curY)
    		return true;
    	if (start-1 == mag)
    		return false;
    	//Checks the zoom on the left tile
    	if (x >= Math.pow(5, mag-start)+curX && x <= Math.pow(5, mag-start)*2-1+curX && y <= Math.pow(5, mag-start)*2-1+curY)
    		return recurse(start+1,curX+(int)(Math.pow(5, mag-start)),curY+(int)(Math.pow(5, mag-start)));
    	//Checks the zoom on the right tile
    	if (x >= Math.pow(5, mag-start)*3+curX && x <= Math.pow(5, mag-start)*4-1+curX && y <= Math.pow(5, mag-start)*2-1+curY)
    		return recurse(start+1,curX+(int)(Math.pow(5, mag-start))*3,curY+(int)(Math.pow(5, mag-start)));
    	//Checks the zoom on the top middle tile
    	if (x >= Math.pow(5, mag-start)*2+curX && x <= Math.pow(5, mag-start)*3-1+curX && y <= Math.pow(5, mag-start)*3-1+curY)
    		return recurse(start+1,curX+(int)(Math.pow(5, mag-start))*2,curY+(int)(Math.pow(5, mag-start))*2);
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
