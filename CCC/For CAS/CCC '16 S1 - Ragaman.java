import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		String a = br.readLine();
		String b = br.readLine();
		int aLength = a.length();
		int bLength = b.length();
		int[] arrA = new int [26];
		int[] arrB = new int [26];
		boolean indic = true;
		//Number of asteriks
		int astNum = 0;
		//Number of different letters
		int diffL = 0;
		int diff;
		if (aLength != bLength)
			indic = false;
		else {
			for (int i = 0; i < b.length(); i ++) {
				arrA[(int)a.charAt(i) - 97]++;
				if (b.charAt(i) == '*')
					astNum++;
				else {
					arrB[(int)b.charAt(i) - 97]++;
				}
			}
			for (int k = 0; k < 26; k ++) {
				diff = arrA[k] - arrB[k];
				if (diff < 0)
					indic = false;
				else if (diff > 0)
					diffL += diff;
			}
			if (diffL != astNum)
				indic = false;
		}
		if (indic)
			System.out.println('A');
		else 
			System.out.println('N');
		
	}

}
