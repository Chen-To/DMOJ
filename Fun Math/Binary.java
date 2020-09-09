import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int times = in.nextInt();
    int input, length;
    String binary, finalBin;
    for (int i = 0; i < times; i ++){
      input = in.nextInt();
      finalBin = "";
      binary = Integer.toBinaryString(input);
      length = binary.length();
      if ((length+1) % 4 == 0)
        binary = "0" + binary;
      else if ((length+2) % 4 == 0)
        binary = "00" + binary;
      else if ((length+3) % 4 == 0)
        binary = "000" + binary;
      for (int k = 0; k <= length; k += 4){
        if (k + 4 <= length){
          finalBin = finalBin + binary.substring(k, k + 4) + " ";
        }
        else {
          finalBin = finalBin + binary.substring(k);
        }
      }
      System.out.println(finalBin);
    }
  }
}
