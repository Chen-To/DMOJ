import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) throws IOException{
  //Encode
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int times = Integer.parseInt(br.readLine())%26;
  String encoded = br.readLine();
  String decoded = "";
  char cap;
  for (int i = 0; i < encoded.length(); i ++){
    if (encoded.charAt(i) != ' '){
      if (encoded.charAt(i) < 'a')
        cap = 'A';
      else
        cap = 'a';
      if (times > 0){
        if (encoded.charAt(i) - times < cap)
          decoded += (char)(25-times+encoded.charAt(i)+1);
        else
          decoded += (char)(encoded.charAt(i)-times);
      }
      else if (times == 0){
        decoded = encoded;
        break;
      }
      else
        if (encoded.charAt(i) - times > cap+25)
          decoded += (char)(-25 - times + encoded.charAt(i)-1);
        else
          decoded += (char)(encoded.charAt(i) - times);
    }
    else
      decoded += ' ';
  }
  System.out.println(decoded);
  }
}
