import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    String orig = in.nextLine();
    String plag = in.nextLine();
    int length = orig.length();
    int repeat = in.nextInt();
    int counter = 0;
    if (length != plag.length())
      System.out.print("No plagiarism");
    else{
      for (int i = 0; i < length; i ++){
        if ((orig.charAt(i) == ' ' && plag.charAt(i) != ' ') || orig.charAt(i) != ' ' && plag.charAt(i) == ' '){
          counter = repeat + 1;
          break;
        }
        else if (orig.charAt(i) != plag.charAt(i))
          counter ++;
      }
      if (counter <= repeat)
        System.out.print("Plagiarized");
      else
        System.out.print("No plagiarism");
    }
    
    }
  }
