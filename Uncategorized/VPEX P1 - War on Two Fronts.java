import java.io.*;
import java.util.*;
public class practice2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String holder = br.readLine();
		String hold[] = holder.split(" ", 5);
		holder = br.readLine();
		String hold2[] = holder.split(" ", 5);
		int set1[] = new int [5];
		int set2[] = new int [5];
		for (int i = 0; i < 5; i ++) {
			set1[i] = Integer.parseInt(hold[i]);
			set2[i] = Integer.parseInt(hold2[i]);
		}
		Arrays.sort(set1);
		Arrays.sort(set2);
		int sum1 = 0, sum2 = 0;
		for (int k = 4; k >= 1; k--) {
			sum1 += set1[k];
			sum2 += set2[k];
		}
		System.out.println(Math.max(sum1, sum2));
	}

}
