import java.io.*;
import java.util.*;
//The Third Cellar
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine());
    String input;
    String[] holder = new String [2];
    int low, high, counter;
    for (int i = 0; i < times; i ++){
      counter = 0;
      input = br.readLine();
      holder = input.split(" ", 2);
      low = Integer.parseInt(holder[0]);
      high = Integer.parseInt(holder[1]);
      if (high <= 2)
        System.out.println(1);
      if (low <= 2)
        counter++;
      boolean arr[] = new boolean [high+1];
      arr[high] = true;
      for (int l = 3; l <= high; l += 2){
        if (arr[l] == false){
          if (l >= low)
            counter ++;
          for (int m = l; m <= high; m += l*2){
            arr[m] = true;
          }
        }
      }
      System.out.println(counter);
    }
  }
}
