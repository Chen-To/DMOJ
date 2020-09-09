import java.util.*;
import java.io.*;
public class PalindromicIntegerPartition {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int sum = 0;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int num = readInt();
        if (num % 2 == 0) {
        	for (int k = 0; k <= num; k += 2) 
        		evenRecurse(num-k);      	
        }
        else {
        	for (int i = 1; i <= num; i += 2) 
        		evenRecurse(num-i);	
    	}
        System.out.println(sum);
    }
    public static void evenRecurse(int num) {
    	if (num == 0) {
    		sum++;
    		return;
    	}
    	for (int i = 1; i <= num/2; i ++) {
    		evenRecurse(num-i*2);
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
