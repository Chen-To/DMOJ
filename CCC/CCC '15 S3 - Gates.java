import java.util.*;
import java.io.*;
public class Main{
  static int gate[];
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int gates = Integer.parseInt(br.readLine());
    int planes = Integer.parseInt(br.readLine());
    gate = new int[gates+1];
    int hold;
    int counter = 0;
    for (int i = 1; i <= gates; i ++){
      gate[i] = i;
    }
    for (int k = 0; k < planes; k ++){
      hold = Integer.parseInt(br.readLine());
      if (findGate(hold) >= 0)
        counter ++;
      else
        break;
    }
    System.out.println(counter);
  }
  public static int findGate(int g){
    if (g==0)
      return -1;
    if (gate[g] < g){
      int parent = findGate(gate[g]);
      gate[g] = parent;
      return parent;
    }
    gate[g] = gate[g-1];
    return gate[g];
  }
}
