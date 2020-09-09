import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    double b;
    double holder = 0;
    long number;
    for (int i = 0; i < a; i ++){
      b = in.nextDouble();
      holder = holder + b;
      if (holder >= 360){
        number = (long)(holder/360);
        holder = holder - number*360;
      }
    } 
    String doubleHold = String.format("%.5f", holder);
    System.out.print(doubleHold);
    }
}
