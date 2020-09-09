import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int times = in.nextInt();
    int high, low, counter;
    boolean secIndicator = true;
    for (int i = 0; i < times; i ++){
      low = in.nextInt();
      high = in.nextInt();
      counter = 0;
      if (low <= 2){
        low = 3;
        counter ++;
      }
      else if (low % 2 == 0)
        low ++;
      if (high % 2 ==0)
        high --;
      else if (high <= 2){
        counter --;
        high --;
      }
      else
        high -= 2;
      for (int k = low; k <= high; k+=2){
        for (int l = 3; l <= Math.sqrt(k); l+=2){
          if (k % l == 0){
            secIndicator = false; 
            break;
          }
        }
        if (secIndicator)
          counter ++;
        secIndicator = true;
      }
      
      System.out.println(counter);
    }
  }
}
