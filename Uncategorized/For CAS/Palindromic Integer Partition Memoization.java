import java.util.*;
import java.io.*;
public class PalindromicWithDP {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int dp[];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int num = readInt();
        long sum = 0;
        dp = new int [num+1];
        dp[1] = 1;
        if (num % 2 == 0) {
        	for (int k = 0; k <= num; k += 2) 
        		sum += evenRecurse(num-k,0);      	
        }
        else {
        	for (int i = 1; i <= num; i += 2) 
        		sum += evenRecurse(num-i, 0);	
    	}
        System.out.println(sum);
    }
    public static int evenRecurse(int num, int sum) {
    	if (num == 0) {	
    		return sum+1;
    	}
    	if (dp[num] != 0 || num == 0) {
    		return sum+dp[num];
    	}
    	int total = 0;
    	for (int i = 1; i <= num/2; i ++) {
    		if (dp[num] == 0 || num == 0) 
    			dp[num-i*2] = evenRecurse(num-i*2, sum);
    		total += dp[num-i*2];
    	}
    	return total;
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
