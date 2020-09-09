import java.util.*;
import java.io.*;
public class HiddenPalindrome {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        String word = readLine();
        System.out.println(detector(word));
 
    }
    public static int detector(String word) {
    	int maxCount = 0;
    	int count = 0;
    	if (word.length() == 1)
    		return 1;
    	//Test case when total palindrome odd length
    	for (int i = 1; i < word.length()-1; i ++) {
    		count = 1;
	    	for (int k = 1; k <= i; k++) {
	    		if (i+k >= word.length())
	    			break;
	    		if (word.charAt(i-k) == word.charAt(i+k))
	    			count += 2;
	    		else 
	    			break;
	    	}
	    	if (count > maxCount)
	    		maxCount = count;
    	}
    	//Test case when total palindrome even length
    	for (int l = 1; l < word.length(); l ++) {
    		count = 0;
    		for (int n = 1; n <= l; n ++) {
    			if (l+n-1 >= word.length())
    				break;
    			if (word.charAt(l+n-1) == word.charAt(l-n))
    				count += 2;
    			else 
    				break;
    		}
	    	if (count > maxCount)
	    		maxCount = count;
    			
    	}
    	return maxCount;
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
