import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class tests {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int num = readInt();
        int sit = readInt();
        ArrayList<Integer> houses = new ArrayList<Integer>();
        for (int i = 0; i < num; i ++) {
        	long x = readLong();
        	long y = readLong();
        	double calc =  Math.sqrt(x*x+y*y);
        	int inside;
        	if (calc % 1 != 0)		
        		inside = (int)Math.sqrt(x*x+y*y)+1;
        	else
        		inside = (int)Math.sqrt(x*x+y*y);
        	houses.add(inside);
        }
        Collections.sort(houses);
        int high, low;
        for (int k = 0; k < sit; k ++) {
        	int distance = readInt();
        	high = houses.size()-1;
        	low = 0;
        	if (houses.get(0) > distance) {
        		System.out.println(0);
        		continue;
        	}
        	while(low <= high) {
        		int mid = (low+high)/2;
        		//System.out.println(houses.get(mid) + " " + high);
        		if (houses.get(mid) > distance)
        			high = mid - 1;	
        		else
        			low = mid + 1;
        	}
        	System.out.println(low);
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
