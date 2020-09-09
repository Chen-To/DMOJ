import java.util.*;
import java.io.*;
public class Pts12 {
	static int [] num;
	static Map<Integer, Integer> map1 = new HashMap<>();
	static Map<Integer, Integer> map2 = new HashMap<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String holder = br.readLine();
		String hold[] = holder.split(" ", 2);
		int n = Integer.parseInt(hold[0]);
		int B = Integer.parseInt(hold[1]);
		num = new int[n];
		int Bpos = -1;
		holder = br.readLine();
		String hold2[] = holder.split(" ", n);
		for (int i = 0; i < n; i ++) {
			num[i] = Integer.parseInt(hold2[i]);
			if(num[i] == B)
				Bpos = i;
		}
		int cur = 0;
		for (int m = Bpos-1; m >= 0; m--) {
			if (num[m] > B)
				cur++;
			else
				cur--;
			if (!map1.containsKey(cur))
				map1.put(cur,1);
			else
				map1.put(cur, map1.get(cur)+1);
		}
		cur = 0;
		for (int k = Bpos+1; k < n; k++) {
			if (num[k] > B)
				cur++;
			else
				cur--;
			if (!map2.containsKey(cur))
				map2.put(cur,1);
			else
				map2.put(cur, map2.get(cur)+1);
		}
		int ans = 1;
		for (int key : map2.keySet()) {
			if (map1.containsKey(-1*key))
				ans += map1.get(-1*key)*map2.get(key);
		}
		if (map1.containsKey(0))
			ans += map1.get(0);
		if (map2.containsKey(0))
			ans += map2.get(0);
		System.out.println(ans);
	}
	
}
