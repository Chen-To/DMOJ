import java.util.*;
import java.io.*;
public class CCC15S1_ZeroThatOut {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int num = readInt();
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < num; i ++) {
        	int k = readInt();
        	if (k != 0)
        		s.add(k);
        	else if (k == 0 && !s.isEmpty())
        		s.pop();
        }
        int sum = 0;
        while(!s.isEmpty()) {
        	sum += s.pop();
        }
        System.out.println(sum);
 
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
