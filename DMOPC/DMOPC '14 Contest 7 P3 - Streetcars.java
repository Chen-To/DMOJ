import java.io.*;
import java.util.*;
//Streetcars
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String holder = br.readLine();
    int times = Integer.parseInt(holder);
    String arr []= new String [2];
    int arrInt[] = new int [2];
    int size, hold;
    ArrayList<Integer> old = new ArrayList<Integer>();
    ArrayList<Integer> news = new ArrayList<Integer>();
    old.add(0);
    news.add(0);
    for (int i = 0; i < times; i ++){
        holder = br.readLine();
        arr = holder.split(" ", 2);
        arrInt[0] = Integer.parseInt(arr[0]);
        arrInt[1] = Integer.parseInt(arr[1]);
        hold = arrInt[0];
        size = old.size();
        for (int k = 0; k < size; k ++){
          //Subtracting percentages
          old.set(k, old.get(k)-old.get(k)*arrInt[1]/100);
          //If it goes beyond number of original streetcars I create a whole bunch of extra streetcars
          if (k == size-1 && old.get(k) + arrInt[0] > 132){
            arrInt[0] = arrInt[0] - 132 + old.get(k);
            old.set(k, 132);
            if (arrInt[0]/132 >= 1){
              for (int l = 0; l < arrInt[0]/132; l++)
                old.add(132);
            }
            if (arrInt[0] % 132 != 0)
              old.add(arrInt[0] % 132);
          }
          //Condition
          else if (old.get(k) +  arrInt[0] > 132){
            arrInt[0] = arrInt[0] - 132 + old.get(k);
            old.set(k, 132);
          }
          else{
            old.set(k, old.get(k) + arrInt[0]);
            arrInt[0] = 0;
          }
        }
        arrInt[0] = hold;
        size = news.size();
        for (int m = 0; m < size; m ++){
          news.set(m, news.get(m)-news.get(m)*arrInt[1]/100);
          if (m == size-1 && news.get(m) + arrInt[0] > 251){
            arrInt[0] = arrInt[0] - 251 + news.get(m);
            news.set(m, 251);
            if (arrInt[0]/251 >= 1){
              for (int n = 0; n < arrInt[0]/251; n++)
                news.add(251);
            }
            if (arrInt[0] % 132 != 0)
              news.add(arrInt[0] % 251);
          }
          else if (news.get(m) +  arrInt[0] > 251){
            arrInt[0] = arrInt[0] - 251 + news.get(m);
            news.set(m, 251);
          }
          else{
            news.set(m, news.get(m) + arrInt[0]);
            arrInt[0] = 0;
          }
        }
    }
    System.out.println(old.size() - news.size());
  }
}
