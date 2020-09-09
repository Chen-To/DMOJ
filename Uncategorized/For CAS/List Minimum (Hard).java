import java.util.*;
import java.io.*;
public class ListMinimumHard {

	 static BufferedReader br;
	 static PrintWriter out;
	 static StringTokenizer st;
	 
	 public static void main(String[] args) throws IOException {
		 br = new BufferedReader(new InputStreamReader(System.in));
	     out = new PrintWriter(new OutputStreamWriter(System.out));
	     int num = readInt();
	     Integer arr[] = new Integer[num];
	     for (int i = 0; i < num; i++) {
	    	 arr[i] = readInt();
	     }
	     Arrays.sort(arr);
	     for (int k = 0; k < num; k ++)
	    	 System.out.println(arr[k]);
	    	 
	 
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
