import java.util.*;
import java.io.*;
public class RimurusNumberGame {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int total = 0;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        long goal = readLong();
        recurse(goal, "2");
        recurse(goal, "3");
        System.out.println(total);
    }
    public static void recurse(long goal, String target) {
    	if (Long.parseLong(target) > goal)
    		return;
    	total++;
    	recurse(goal, target+"2");
    	recurse(goal, target+"3");
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
