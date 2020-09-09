import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int times = in.nextInt();
    int number;
    String primeFactors;
    for (int i = 0; i < times; i ++){
      primeFactors = "";
      number = in.nextInt();
      for (int counter = 2; counter <= Math.sqrt(number);){
        if (number % counter == 0){
          primeFactors = primeFactors + counter + " ";
          number = number/counter;
        }
        else if (counter != 2)
          counter +=2;
        else 
          counter ++;
      }
      System.out.print(primeFactors); 
      System.out.println(number);
    }
  }
}
