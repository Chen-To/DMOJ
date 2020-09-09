import java.util.*;
import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner (System.in);
    int times = in.nextInt();
    int harm [] = new int [times];
    int total = 0;
    int bad, index;
    for (int i = 0; i < times; i ++){
      harm[i] = in.nextInt();
      total += harm[i];
    }
    times = in.nextInt();
    for (int k = 0; k < times; k ++){
      index = in.nextInt()-1;
      bad = in.nextInt();
      if (harm[index]<bad || harm[index+1]<bad)
        total = total - Math.min(harm[index],harm[index+1]);
      else
        total -= bad;
    }
    System.out.println(total);
  }
}
