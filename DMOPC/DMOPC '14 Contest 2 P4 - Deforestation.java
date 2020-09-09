import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String hold;
    String[] holder = new String [2];
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int [num];
    int range1, range2;
    int total = 0;
    arr[0] = Integer.parseInt(br.readLine());
    for (int i = 1; i < num; i ++){
      arr[i] = arr[i-1] + Integer.parseInt(br.readLine());
    }
    num = Integer.parseInt(br.readLine());
    for (int m = 0; m < num; m ++){
      hold = br.readLine();
      holder = hold.split(" ", 2);
      range1 = Integer.parseInt(holder[0]);
      range2 = Integer.parseInt(holder[1]);
      if (range1 == 0)
        System.out.println(arr[range2]);
      else
        System.out.println(arr[range2] - arr[range1-1]); 
    }
  }
}
