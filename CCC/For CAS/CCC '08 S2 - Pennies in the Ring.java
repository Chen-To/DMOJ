import java.util.*;
import java.io.*;
public class PenniesInTheRing {

	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));	
        int counter = 0;
        while (true) {
        	counter = 0; 
        	int rad = readInt();
        	if (rad == 0)
        		break;
        	for (int row = 1; row <= rad - 1; row ++) {
        		counter += (int)(Math.sqrt(rad*rad-row*row));
        	}	
        	System.out.println(4*(counter+rad)+1);
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
