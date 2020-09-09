import java.util.*; 
import java.io.*;
public class PhoneBookJ3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times1 = Integer.parseInt(br.readLine());
		int times2, max, maxKey;
		int number;
		String[] holder = new String [2];
		String name;
		Map <Integer,String> names = new HashMap<>();
		Map <Integer,Integer> phone = new HashMap<>();
		int keys[] = new int [times1];
		for (int i = 0; i < times1; i ++) {
			name = br.readLine();
			holder = name.split(" ", 2);
			name = holder[0];
			number = Integer.parseInt(holder[1]);
			phone.put(number, 0);
			keys[i] = number;
			names.put(number, name);
		}
		times2 = Integer.parseInt(br.readLine());
		for (int k = 0; k < times2; k ++) {
			number = Integer.parseInt(br.readLine());
			if (phone.containsKey(number)) {
				phone.put(number, phone.get(number)+1);
			}
		}
		max = phone.get(keys[0]);
		maxKey = keys[0];
		for (int l = 1; l < times1; l ++) {
			if (max < phone.get(keys[l])) {
				max = phone.get(keys[l]);
				maxKey = keys[l];
			}
			else if (max == phone.get(keys[l])) {
				maxKey = Math.min(maxKey, keys[l]);
			}
		}
		System.out.println(names.get(maxKey));
	}

}
