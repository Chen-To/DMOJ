import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int counter = 1; 
    int a;
    while (true) {
      a = in.nextInt();
      if (counter + a <= 100)
        counter = counter + a;
      if (a == 0){
        System.out.println("You Quit!");
        break;
      }
      if (counter == 9)
        counter = 34;
      else if (counter == 40)
        counter = 64;
      else if (counter == 67)
        counter = 86;
      else if (counter == 54)
        counter = 19;
      else if (counter == 90)
        counter = 48;
      else if (counter == 99)
        counter = 77;
      else if (counter == 100){
        System.out.println("You are now on square " + counter);
        System.out.println("You Win!");
        break;
      }
      System.out.println("You are now on square " + counter);
    }
    
    }
}
