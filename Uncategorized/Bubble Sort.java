import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    int num = in.nextInt();
    int[] arr = new int [num];
    int holder = -1;
    String output = "";
    for (int m = 0; m < num; m ++){
      arr[m] = in.nextInt();
      output = output + arr[m] + " ";
    }
    int len = output.length();
    System.out.println(output.substring(0,len-1));
    for (int i = 0; i < num; i++){         
       for (int n = 0; n < num-i-1; n++)  {
           if (arr[n] > arr[n+1]) {
              holder = arr[n];
              arr[n] = arr[n+1];
              arr[n+1] = holder;
              output = "";
              for (int l = 0; l < num; l ++){
                output = output + arr[l] + " ";
              }
              System.out.println(output.substring(0,len-1));
           }
        }
    }
    
}
}
