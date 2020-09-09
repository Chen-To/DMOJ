import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    double height = in.nextInt();
    int num = in.nextInt();
    int counter = 0;
    double input;
    for (int i = 0; i < num; i ++){
      input= in.nextDouble();
      if (input >= height)
        counter ++;
    }
    System.out.print(counter);
    
  }
}
