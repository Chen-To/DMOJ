import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    double distance = 0;
    double[] start = new double [num];
    double[] end = new double [num];
    String[] holder = new String [num];
    String[] holder2 = new String [num];
    String hold = br.readLine();
    String hold2 = br.readLine();
    holder = hold.split(" ", num);
    holder2 = hold2.split(" ", num);
      for (int i = 0; i < num; i ++){
        start[i] = Double.parseDouble(holder[i]);
        end[i] = Double.parseDouble(holder2[i]);
      }
      for (int k = 0; k < num; k ++){
        distance = distance + (start[k]-end[k])*(start[k]-end[k]);
      }
    distance = Math.sqrt(distance);
    System.out.print(Math.round(distance*1000000)/1000000.0);
}
}
