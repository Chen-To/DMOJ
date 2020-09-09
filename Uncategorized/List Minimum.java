import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int length = in.nextInt();
    int [] array = new int[length];
    for (int i = 0; i < length; i ++){
      array[i] = in.nextInt();
    }
    Arrays.sort(array);
    for (int k = 0; k < length; k ++){
      System.out.println(array[k]);
    }
    }
}
