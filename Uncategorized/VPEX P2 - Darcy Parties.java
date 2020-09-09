import java.io.*;
import java.util.*;
public class practice3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int people = Integer.parseInt(br.readLine());
		String hold = br.readLine();
		String holder[] = hold.split(" ", people);
		int pizza[] = new int [people];
		int total = 0;
		int mis = 0;
		for (int i = 0; i < people; i ++) {
			pizza[i] = Integer.parseInt(holder[i]);
			total += pizza[i];
		}
		int avg = total/people;
		for (int k = 0; k < people; k ++) {
			if (pizza[k] != avg)
				mis += 1;
		}
		System.out.println(mis);
			
	}

}
