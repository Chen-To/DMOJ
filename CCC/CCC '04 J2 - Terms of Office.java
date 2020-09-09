import java.io.*;
import java.util.*;
public class j2LOL {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		for (int i = x; i <= y; i ++) {
			if ((i-x) % 60 == 0)
				System.out.printf("All positions change in year %s%n", i);
		}

	}

}
