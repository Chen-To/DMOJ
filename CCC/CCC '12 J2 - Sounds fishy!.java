import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int a, b, c ,d;
    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();
    d = in.nextInt();
    if (a < b && b < c && c < d)
      System.out.println("Fish Rising");
    else if (a > b && b > c && c > d)
      System.out.println("Fish Diving");
    else if (a == b && b == c && c == d)
      System.out.println("Fish At Constant Depth");
    else
      System.out.println("No Fish");
    }
}
