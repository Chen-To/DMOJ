import java.util.*;
import java.io.*;
public class Prva {
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static char arr[][];
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int height = readInt();
        int length = readInt();
        String minWord = "zzzzzzzzzzzzzz";
        String word = "";
        String holder;
        arr = new char[length][height];
        for (int i = 0; i < height; i ++) {
        	holder = readLine();
        	for (int k = 0; k < length; k ++) {
        		arr[k][i] = holder.charAt(k);
        	}
        }
        //Horizontal Brute Force
        for (int y = 0; y < height; y ++) {
        	for (int x = 0; x < length; x ++) {
        		if (arr[x][y] == '#') {
        			if (word.length() > 1 && word.compareTo(minWord) < 1) {
        				minWord = word;
        			}
        			word = "";
        		}
        		else if (x == length -1) {
        			word += arr[x][y];
        			if (word.length() > 1 && word.compareTo(minWord) < 1) {
        				minWord = word;
        			}
        			word = "";
        		}
        		else {
        			word += arr[x][y];
				}
        	}
        }
        
        //Vertical Brute Force
        for (int secX = 0; secX < length; secX ++) {
        	for (int secY = 0; secY < height; secY ++) {
        		if (arr[secX][secY] == '#') {
        			if (word.length() > 1 && word.compareTo(minWord) < 1) {
        				minWord = word;
        			}
        			word = "";
        		}
        		else if (secY == height - 1) {
        			word += arr[secX][secY];
        			if (word.length() > 1 && word.compareTo(minWord) < 1) {
        				minWord = word;
        			}
        			word = "";
        		}
        		else {
        			word += arr[secX][secY];
				}
        	}
        }
        System.out.println(minWord);
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
