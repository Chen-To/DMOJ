import java.io.*;
import java.util.*;
//Bus Jam
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String holder = br.readLine();
    String arr []= new String [3];
    arr = holder.split(" ", 3);
    int buses = Integer.parseInt(arr[0]);
    int delay = Integer.parseInt(arr[1]);
    int seperate = Integer.parseInt(arr[2]);
    int breaks = 0;
    int busTimes[] = new int [buses];
    for (int i = 0; i < buses; i ++)
      busTimes[i] = Integer.parseInt(br.readLine());
    for (int l = buses-1; l > 0; l--){
      while(busTimes[l] - busTimes[l-1] > seperate){
        busTimes[l-1] += delay;
        breaks ++;
      }
    }
    System.out.println(breaks);
    
  }
}
