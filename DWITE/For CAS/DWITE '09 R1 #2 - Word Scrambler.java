import java.io.*;
import java.util.*;
public class J1 {

	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static ArrayList<String> perm = new ArrayList<String>();
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        String str, str2;
        ArrayList<Character> temp = new ArrayList<Character>();
        for (int i = 0; i < 5; i ++) {
        	str2 = "";
        	str = readLine();
        	int sort[] = new int [str.length()];
        	for (int k = 0; k < str.length(); k++) {
        		sort[k] = (int)str.charAt(k);
        	}
        	Arrays.sort(sort);
        	for (int m = 0; m < str.length(); m++) {
        		str2 += (char)sort[m];
        	}
        	recurse(str2, str2.length(), temp);
        	for (int l = 0; l < perm.size(); l++) {
        		System.out.println(perm.get(l));
        	}
        	perm.clear();
        }
    }
    public static void recurse(String str, int n, ArrayList<Character> temp) {
    	if (temp.size() == n) {
    		String tempStr = "";
    		for (char a : temp)
    			tempStr += a;
    		perm.add(tempStr);
    		return;
    	}
    	for (int i = 0; i < n; i++) {
    		if (!temp.contains(str.charAt(i))) {
    			temp.add(str.charAt(i));
    			recurse(str,n,temp);
    			temp.remove(temp.size()-1);
    		}
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
