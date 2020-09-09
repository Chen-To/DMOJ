import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    int number1 = in.nextInt();
    int input;
    double total = 0;
    for (int i = 0; i < number1; i ++){
      input = in.nextInt();
      total += input;
    }
    int number2 = in.nextInt();
    int[] newStudents = new int [number2];
    for (int k = 0; k < number2; k ++){
      newStudents[k] = in.nextInt();
      total = Math.round((total+newStudents[k])/(number1+1+k)*1000)/1000.0;
      System.out.format("%.3f", total);
      System.out.println("");
      total = (number1+1+k)*total;
    }
    
  }
}
