import java.util.*;
import java.io.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    int num = in.nextInt();
    int copier = num/2;
    int counter = 1;
    for (int i = 0; i < num; i ++){
      if (i == 0 || i == num-1){
        for (int n = 0; n < num; n ++)
          System.out.print("*");
      }
      else if (i < num/2+1){
        for (int m = 0; m < copier; m++)
          System.out.print("*");
        for (int l = 0; l < counter; l ++)
          System.out.print(" ");
        for (int o = 0; o < copier; o++)
          System.out.print("*");
        copier --;
        counter += 2;
      }
      else{
        if(copier == 0){
          copier ++;
          counter -= 2;
        }
        copier ++;
        counter -= 2;
        for (int w = 0; w < copier; w ++)
          System.out.print("*");
        for (int p = 0; p < counter; p ++)
          System.out.print(" ");
        for (int u = 0; u < copier; u ++)
          System.out.print("*");
      }
      System.out.println();
    }
  }
}
