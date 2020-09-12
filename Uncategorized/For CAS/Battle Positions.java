import java.io.*;
import java.util.*;
public class BattlePositions {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int stations = readInt();
        int min = readInt();
        int waves = readInt();
        int diff[] = new int [stations+1];
        int arr[] = new int [stations+1];
        int counter = 0;
        for (int i = 0; i < waves; i ++) {
        	int a = readInt();
        	int b = readInt();
        	int troops = readInt();
        	diff[a] += troops;
        	if (b < stations)
        		diff[b+1] -= troops;
        }
        for (int k = 1; k <= stations; k ++) {
        	if (k == 1)
        		arr[k] = diff[k];
        	else {
        		arr[k] = diff[k] + arr[k-1];
        	}
        	if (arr[k] < min)
        		counter++;
        }
        System.out.println(counter);
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
