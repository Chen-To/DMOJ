import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    int b = (int)Math.sqrt(a);
    System.out.print("The largest square has side length " + b + ".");
    }
}
