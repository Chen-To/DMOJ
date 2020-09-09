import java.io.*;
import java.util.*;
//Babbling Brooks
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int times = Integer.parseInt(br.readLine());
    ArrayList<Integer> amount = new ArrayList<Integer>(times);
    int input;
    int calc;
    for (int i = 0; i < times; i ++)
      amount.add((Integer.parseInt(br.readLine())));
    while (true){
      input = Integer.parseInt(br.readLine());
      if (input == 77)
        break;
      else if (input == 88){
        times = Integer.parseInt(br.readLine())-1;
        amount.set(times, amount.get(times)+amount.get(times+1));
        amount.remove(times+1);
      }
      else{
        times = Integer.parseInt(br.readLine())-1;
        input = Integer.parseInt(br.readLine());
        calc = (int)Math.round(amount.get(times)/100.0*input);
        amount.add(times, calc);
        amount.set(times+1, amount.get(times+1) - calc);
      }
    }
    for (int i = 0; i < amount.size(); i ++){
      System.out.print(amount.get(i) + " ");
    }
  }
}
