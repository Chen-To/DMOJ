import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int isPrime, total;
    for (int i = 0; i < 5; i ++){
      total = 2;
      isPrime = in.nextInt();
      for (int k = 3; k <= isPrime; k+=2){
        boolean secIndicator = true;
        for (int l = 3; l <= Math.sqrt(k); l+=2){
            if (k % l == 0){
              secIndicator = false; 
              break;
            }
        }
        if (secIndicator)
            total += k;
      }
      System.out.println(total);
    }
    }
    
  }
