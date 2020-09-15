import java.util.*;
import java.io.*;
public class TSSProblemB {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int num = readInt();
        int sit = readInt();
        int houses[] = new int[1414215];
        for (int i = 0; i < num; i ++) {
        	long x = readLong();
        	long y = readLong();
        	double calc =  Math.sqrt(x*x+y*y);
        	int inside;
        	if (calc % 1 != 0)		
        		inside = (int)calc+1;
        	else
        		inside = (int)calc;	
        	houses[inside] +=1;
        }
        for (int l = 1; l < houses.length; l ++) {
        	if (houses[l] == 0)
        		houses[l] = houses[l-1];
        	else
        		houses[l] += houses[l-1];
        }
        for (int k = 0; k < sit; k ++) {
        	int distance = readInt();
        	System.out.println(houses[distance]);
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
