import java.io.*;
import java.util.*;
public class CoolNumbers {

	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));	
        int lower = readInt();
        int higher = readInt();	
        int max = (int)(Math.cbrt(Math.sqrt(higher)));
        int less = (int)(Math.cbrt(Math.sqrt(lower)));
        if (Math.cbrt(Math.sqrt(lower)) % 1 == 0)
        	System.out.println(max-less+1);
        else 
        	System.out.println(max-less);
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
