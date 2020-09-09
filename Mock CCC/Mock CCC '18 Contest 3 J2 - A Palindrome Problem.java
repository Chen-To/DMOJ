import java.util.*;
import java.io.*;
public class IdentifyingPalindromes {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        String word = readLine();
        boolean checker = false;
        if (word.length()<= 1)
        	System.out.println("NO");
        else {
        	for (int i = 1; i < word.length(); i ++) {
        		if (check(word.substring(0,i), 0) && check(word.substring(i), 0)) {
        			checker = true;
        			break;
        		}
        	}
        	if (checker)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
        	
    }
    public static boolean check(String word, int position) {
    	if (position == Math.round(word.length()/2))
    		return true;
    	if (word.charAt(position) != word.charAt(word.length()-position-1))
    		return false;
    	return check(word, position+1);
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
