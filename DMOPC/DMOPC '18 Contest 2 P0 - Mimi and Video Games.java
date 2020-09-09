import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int field = in.nextInt();
    int cost = in.nextInt();
    int money = in.nextInt();
    if (money/cost >= field)
      System.out.print(field);
    else
      System.out.print(money/cost);
  }
}
