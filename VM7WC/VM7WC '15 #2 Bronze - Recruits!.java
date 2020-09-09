import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int numberOf = in.nextInt();
    int[] array = new int [numberOf];
    int counter = 0;
    for (int i = 0; i < numberOf; i++){
      array[i] = in.nextInt();
    }
    for (int k = 0; k < numberOf; k++){
      if (array[k] > 41 ){
        if (k+1 < numberOf && k-1 > 0){
          array[k+1] = 42;
          array[k-1] = 42;
          array[k-1] = 42;
        }
        else if (k == 0)
          array[k+1] = 42;
        else
          array[k-1] = 42;
        
    }
    }
    for (int m = 0; m < numberOf; m++){
      if (array[m] <= 41)
        counter ++;
    }
    System.out.println(counter);
    }
  }
