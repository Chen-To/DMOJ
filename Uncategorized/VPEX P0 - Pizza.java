import java.io.*;
import java.util.*;
public class practice {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String holder = br.readLine();
		String hold[] = holder.split(" ", 2);
		long pizza = Long.parseLong(hold[0]);
		int people = Integer.parseInt(hold[1]);
		System.out.print(pizza/people + " ");
		System.out.println(pizza%people);
	}

}
