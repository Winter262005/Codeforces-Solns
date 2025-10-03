import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      for (int i = 0; i<n; i++){
        String word = sc.nextLine();
        int length = word.length();
      
        if (length > 10){
          System.out.println("" + word.charAt(0) + (length-2) + word.charAt(length-1));
        } else {
          System.out.println(word);
        }
      }
  }
}
