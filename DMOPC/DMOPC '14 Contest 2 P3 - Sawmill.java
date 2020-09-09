import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner (System.in);
    int num = in.nextInt();
    long total = 0;
    int input;
    ArrayList<Integer> saw = new ArrayList<Integer>();
    ArrayList<Integer> logs = new ArrayList<Integer>();
    for (int i = 0; i < num; i ++){
      input = in.nextInt();
      saw.add(input);
    }
    Collections.sort(saw, Collections.reverseOrder());
    for (int k = 0; k < num; k ++){
      input = in.nextInt();
      logs.add(input);
    }
    Collections.sort(logs);
    for (int m = 0; m < num; m++){
      total = total + saw.get(m)*logs.get(m);
    }
    System.out.println(total);
  }
}
