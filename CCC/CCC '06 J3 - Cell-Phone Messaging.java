import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String input, last;
    int length, time;
    while (true){
      input = in.nextLine();
      if (input.equalsIgnoreCase("halt"))
        break;
      length = input.length();
      time = 0;
      last = "";
      for (int i = 0; i < length; i ++){
        if (last.indexOf(input.charAt(i)) != -1)
          time += 2;
        for (int k = 97; k <= 109; k += 3){
        if (input.charAt(i) - (char)k <= 2 && input.charAt(i) - (char)k >= 0){
          time = time + input.charAt(i) - (char)k + 1;
          last = Character.toString((char)k) + Character.toString((char)(k+1)) +Character.toString((char)(k+2));
        }
        }
        if (input.charAt(i) - 'p' <= 3 && input.charAt(i) - 'p' >= 0){
          time = time + input.charAt(i) - 'p' + 1;
          last = "pqrs";
        }
        else if (input.charAt(i) - 't' <= 2 && input.charAt(i) - 't' >= 0){
          time = time + input.charAt(i) - 't' + 1;
          last = "tuv";
        }
        else if (input.charAt(i) - 'w' <= 3 && input.charAt(i) - 'w' >= 0){
          time = time + input.charAt(i) - 'w' + 1;
          last = "wxyz";
        }
      }
    System.out.println(time);
    }
    }
  }
