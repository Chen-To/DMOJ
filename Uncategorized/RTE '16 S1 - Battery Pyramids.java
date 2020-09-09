import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine());
    int num, random;
    int total = 0;
    String hold;
    String holder[] = new String [2];
    for (int i = 0; i < times; i ++){
      hold = br.readLine();
      holder = hold.split(" ", 2);
      num = Integer.parseInt(holder[0])-Integer.parseInt(holder[1]);
      random = num + 1;
      total = 0;
      for (int k = 1; k <= random; k ++ ){
        if (num - k*(k+1)/2 >= 0){
          total += k*(k+1)/2;
          num -= k*(k+1)/2;
        }
        else{
          System.out.println(total);
          break;
        }
      }
    }
  }
}
