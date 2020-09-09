import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int times = in.nextInt();
    int size = times * 2 - 2;
    int copy = size;
    int count = 0;
    char arr[][] = new char[size+1][size+1];
    arr[size/2][size/2] = 'a';
    if (times == 1)
      System.out.print('a');
    else{
      for (int i = times-1; i > 0; i --){
        for (int l = count; l < copy; l ++){
          arr[l][count] = (char)((int)'a' + i);
          arr[size-l][copy] = (char)((int)'a' + i);
          arr[size-count][l] = (char)((int)'a' + i);
          arr[count][size-l] = (char)((int)'a' + i);
        } 
        copy --;
        count ++;
      }
      for (int k = 0; k <= size; k++){
        for (int m = 0; m <= size; m ++)
          System.out.print(arr[k][m]);
        System.out.println();
    }
    }
  }
}
