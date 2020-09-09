import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String inserted = in.nextLine();
    int at = inserted.indexOf("not");
    int numberOf = 0;
    while (at != -1) {
      numberOf++;
      inserted = inserted.substring(at + 1);
      at = inserted.indexOf("not");
} 
    if (numberOf % 2 == 0 && inserted.substring(inserted.length()-4).equalsIgnoreCase("true"))
      System.out.print("True");
    else if (numberOf % 2 != 0 && inserted.substring(inserted.length()-5).equalsIgnoreCase("false"))
      System.out.print("True");
    else 
      System.out.print("False");
    }
}
