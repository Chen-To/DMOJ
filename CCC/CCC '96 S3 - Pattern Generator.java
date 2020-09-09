//CCC 96 S3
import java.util.*;
import java.io.*;
public class PatternGenerator {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int length = 0;
    static int num1 = 0;
    static int num0 = 0;
    static ArrayList<String> set = new ArrayList<String>();
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int times = readInt();
        for (int i = 0; i < times; i ++) {
        	length = readInt();
        	num1 = readInt();
        	num0 = length - num1;
        	maker(0,0,"");
        	System.out.println("The bit patterns are");
        	for (int k = set.size()-1; k >= 0; k--)
        		System.out.println(set.get(k));
        	System.out.println();
        	set.clear();
        }
    }
    public static void maker(int zeros, int ones, String hold) {
    	if (zeros+ones == length) {
    		set.add(hold);
    		return;
    	}
    	if (ones == num1) {
    		hold = finisher0(num0-zeros,hold);
    		zeros = num0;
    		set.add(hold);
    		return;
    	}
    	if (zeros == num0) {
    		hold = finisher1(num1-ones,hold);
    		ones = num1;
    		set.add(hold);
    		return;
    	}
    	maker(zeros+1, ones, hold+"0");
    	maker(zeros, ones+1, hold+"1");
    }
    public static String finisher0(int zeros, String hold) {
    	for (int i = 0; i < zeros; i ++)
    		hold += "0";
    	return hold;
    }
    public static String finisher1(int ones, String hold) {
    	for (int i = 0; i < ones; i ++)
    		hold += "1";
    	return hold;
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
