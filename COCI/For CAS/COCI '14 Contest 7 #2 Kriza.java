import java.util.*;
import java.io.*;
public class KrizaGood {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
 
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int doors = readInt();
        int att = readInt();
        int unique = 0;
        long counter = 0;
        long finalAns = 0;
        long prefix[] = new long [doors+1];
        int key = 1;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        for (int i = 1; i <= doors; i ++) {
        	int door = readInt();
        	map.put(door, i);
        }
        if (att <= doors) {
        	for(int k = 1; k <= att; k ++) {
        		if (map.get(k) >= key) {
        			counter += map.get(k) - key;
        			key = map.get(k);
        		}
        		else {
        			counter += doors - key + map.get(k);
        			key = map.get(k);
        		}
        		
        	}
        	System.out.println(counter);
        	return;
        }
        else {
        	for(int l = 1; l <= doors; l ++) {
        		if (l == 1) {
        			unique = map.get(l) - key;
        			key = map.get(l);
        		}
        		else if (map.get(l) >= key) {
        			counter += map.get(l) - key;
        			prefix[l] = counter;
        			key = map.get(l);
        		}
        		else {
        			counter += doors - key + map.get(l);
        			prefix[l] = counter;
        			key = map.get(l);
        		}
        	}
        }
        if (key == map.get(1))
        	finalAns = att/doors * (prefix[doors]) + unique;
        else {
        	if (key > map.get(1))
        		prefix[1] = doors - key + map.get(1);
        	else
        		prefix[1] = map.get(1) - key;
        	finalAns = att/doors * (prefix[doors]+prefix[1]) + unique;
        }
        if (att % doors == 0)
        	finalAns -= prefix[1];
        finalAns += prefix[att%doors];
        System.out.println(finalAns);
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
