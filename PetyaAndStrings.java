import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class PetyaAndStrings {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    
    byte[] str1 = s1.getBytes(StandardCharsets.US_ASCII);
    byte[] str2 = s2.getBytes(StandardCharsets.US_ASCII);

    int result = Arrays.compare(str1, str2);
    
    if (result == 0){
      System.out.println(0);
    } else if (result > 0) {
      System.out.println(1);
    } else {
      System.out.println(-1);
    }
  }
}
