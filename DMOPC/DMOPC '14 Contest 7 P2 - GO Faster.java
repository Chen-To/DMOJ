import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine())-2;
    String hold = br.readLine();
    String holder[] = holder = hold.split(" ", 2);
    int arr [] = new int [2];
    arr[0] = Integer.parseInt(holder[0]);
    arr[1] = Integer.parseInt(holder[1]);
    int first = arr[0] - arr[1];
    int firstmin = first;
    int other = 0;
    for (int i = 0; i < times; i ++){
        hold = br.readLine();
        holder = hold.split(" ", 2);
        arr[0] = Integer.parseInt(holder[0]);
        arr[1] = Integer.parseInt(holder[1]);
        other -= arr[1];
        if (other < 0){
          first += other;
          other = 0;
        }
        other += arr[0];
        firstmin -= arr[1];
        if (firstmin < 0)
          firstmin = 0;
    }
    System.out.println(firstmin);
    System.out.println(first);
  }
}
