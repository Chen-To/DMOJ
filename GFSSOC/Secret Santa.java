import java.util.*;
import java.io.*;
public class SecretSanta{
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static Map<Integer,Integer> m = new HashMap<Integer,Integer>();
    static int floors[];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        Set<Integer> done = new HashSet<Integer>();
        int presents =  readInt();
        int weight = 0;
        floors = new int[presents];
        int temp;
        for (int k = 0; k < presents; k ++) {
        	floors[k] = readInt();
        	temp = readInt();
        	m.put(floors[k], temp);
        	weight += temp;
        }
        System.out.println(recurse(0,weight,101,done));
        
    }
    public static int recurse(int stress, int weight, int cur, Set<Integer> done){
    	if (weight == 0)
    		return stress;
    	int min = 2000000000;
    	//System.out.println("Track: " + cur + " " + stress);
    	for (int i = 0; i < floors.length; i ++) {
    		int res;
    		if (m.containsKey(floors[i]) && !done.contains(floors[i])) {
    			int temp = m.get(floors[i]);
    			done.add(floors[i]);
    			if (cur > floors[i])
    				res = recurse(stress+weight*(cur-floors[i]+1), weight-temp, floors[i], done);
    			else
    				res = recurse(stress+weight*(floors[i]-cur+1), weight-temp, floors[i], done);
    			done.remove(floors[i]);
    			if (res < min) {
    				min = res;	
    			}
    		}
    	}
    	return min;
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
