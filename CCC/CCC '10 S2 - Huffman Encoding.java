import java.util.*;
import java.io.*;
public class hoffmanS2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, String> hm = new HashMap<>();
		for (int i = 0; i < n; i ++) {
			String holder = br.readLine();
			String hold[] = holder.split(" ", 2);
			hm.put(hold[1], hold[0]);
		}
		Set<String> find = hm.keySet();
		String stupidity = br.readLine();
		String compare;
		int counter = 0;
		while(counter < stupidity.length()) {
			compare = "";
			for (int m = counter; m < stupidity.length(); m ++) {
				compare += stupidity.charAt(m);
				if (find.contains(compare)) {
					System.out.print(hm.get(compare));
					counter = m+1;
					break;
				}
			}	

		}
		
	}

}
