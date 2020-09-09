import java.util.*;
import java.io.*;
public class Main {
	static int parent[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String holder = br.readLine();
		String hold[] = holder.split(" ", 2);
		String hold2[] = new String [3];
		int cities = Integer.parseInt(hold[0]);
		parent = new int [cities+1];
		for (int fill = 1; fill <= cities; fill++)
			parent[fill] = fill;
		int que = Integer.parseInt((hold[1]));
		int c1, c2;
		for (int i = 0; i < que; i ++) {
			holder = br.readLine();
			hold2 = holder.split(" ", 3);
			c1 = Integer.parseInt(hold2[1]);
			c2 = Integer.parseInt(hold2[2]);
			int rx = findRoot(c1);
			int ry = findRoot(c2);
			if (hold2[0].equalsIgnoreCase("a")) {
				if (rx != ry)
					parent[ry] = parent[rx];
			}
			else {
				if (rx == ry)
					System.out.println("Y");
				else
					System.out.println("N");
			}
		}

	}
	public static int findRoot(int x) {
		if(parent[x] == x)
			return x;
		return findRoot(parent[x]);
	}

}
