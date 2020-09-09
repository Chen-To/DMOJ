import java.io.*;
import java.util.*;
public class J1 {

	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
   
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));	
        double weight = readDouble();
        double height = readDouble();
        if (weight/height/height > 25)
        	System.out.println("Overweight");
        else if (weight/height/height < 18.5)
        	System.out.println("Underweight");
        else
        	System.out.println("Normal weight");
        	
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
