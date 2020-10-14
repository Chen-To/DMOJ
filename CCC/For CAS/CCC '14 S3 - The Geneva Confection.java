import java.util.*;
import java.io.*;
public class CCC14S3_GenevaConfection {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int cases = readInt();
        for (int i = 0; i < cases; i ++) {
        	int cars = readInt();
        	boolean indic = true;
        	Set<Integer> set = new HashSet<Integer>();
    		Stack<Integer> s = new Stack<Integer>();
    		Stack<Integer> branch = new Stack<Integer>();
        	for (int k = 0; k < cars; k ++) {
        		int car = readInt();
        		set.add(car);
        		s.add(car);
        	}
        	for (int order = 1; order <= cars; order++) {
        		boolean cont = set.contains(order);
        		if(cont) {
        			while(!s.isEmpty()) {
        				int temp = s.pop();
        				set.remove(temp);
        				if (temp != order)
        					branch.add(temp);
        				else
        					break;
        			}
        		}
        		else if (branch.pop() != order) {
        			indic = false;
        			break;
        		}
        			
        	}
        	if (indic)
        		System.out.println("Y");
        	else
        		System.out.println("N");
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
