import java.io.*;
import java.util.*;
public class Zeroes {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        long a = readInt();
        long b = readInt();	
        long max = 5000000000L;
        long low = 1,mid;
        long divisor = 5;
        long count, highest = 0, lowest = 0;
        while(low != max) {
        	count = 0;
        	divisor = 5;
        	mid = (low+max)/2;	
        	//Count Zeroes in the while loop
        	while(divisor <= mid) {
        		count += (long)mid/divisor;
        		divisor*=5;
        	}
        	/*if (count == b) {
        		highest = mid;
        		break;
        	}*/
        	if(count > b) {
        		max = mid;
        	}
        	else
        		low = mid+1;
        }
        highest = low;
        low = 1; 
        while(low != max) {
        	count = 0;
        	divisor = 5;
        	mid = (low+max)/2;
        	//Count Zeroes in the while loop
        	while(divisor <= mid) {
        		count += (long)mid/divisor;
        		divisor*=5;
        	}
        	/*if (count == a) {
        		lowest = mid;
        		break;
        	}*/
        	if(count >= a) 
        		max = mid;	
        	else
        		low = mid+1;
        }
        lowest = low;
        System.out.println(highest-lowest);
        
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
