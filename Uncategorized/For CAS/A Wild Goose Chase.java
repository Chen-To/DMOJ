import java.io.*;
import java.util.*;
public class WildChooseChase {

	 static BufferedReader br;
	    static PrintWriter out;
	    static StringTokenizer st;
	 
	    public static void main(String[] args) throws IOException {
	        br = new BufferedReader(new InputStreamReader(System.in));
	        out = new PrintWriter(new OutputStreamWriter(System.out));
	        int sus = readInt();
	        int t = readInt();
	        int check;
	        int not;
	        int total = 0;
	        boolean checker = true;
	        int[] fox = new int [sus+1];
	        for (int i = 1; i <= sus; i ++) {
	        	not = readInt();
	        	check = readInt();
	        	if (check != -1) {
	        		fox[check]++;
	        	}
	        	else {
	        		total++;
	        		fox[not]--;	
	        	}
	        }
	        for (int l = 1; l <= sus; l ++) {
	        	if (fox[l]+total == t) {
	        		System.out.print(l + " ");
	        		checker = false;
	        	}
	        }
	        if (checker)
	        	System.out.println(-1);
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
