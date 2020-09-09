import java.io.*;
import java.util.*;
//Largest Permutation
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String holder = br.readLine();
    String arr []= new String [2];
    arr = holder.split(" ", 2);
    int size = Integer.parseInt(arr[0]);
    int swaps = Integer.parseInt(arr[1]);
    holder = br.readLine();
    String temp[] = new String [size];
    temp = holder.split(" ", size);
    int nums [] = new int [size];
    int numsDup [] = new int [size];
    int max, hold;
    int index = 0;
    for (int i = 0; i < size; i ++)
      nums[i] = Integer.parseInt(temp[i]);
      /*numsDup[i] = nums[i];
    }
    Array.sort*/
    for (int l = 0; l < size; l ++){
      max = nums[l];
      index = l;
      if (swaps == 0)
        break;
      for (int m = l; m < size; m ++){
        if (max < nums[m]){
          max = nums[m];
          index = m;
        }
      }
      if (nums[l] != max){
        hold = nums[l];
        nums[l] = max;
        nums[index] = hold;
        swaps --;
      }
    }
    for (int r = 0; r < size; r ++){
      System.out.print(nums[r] + " ");
    }
    
  }
}
