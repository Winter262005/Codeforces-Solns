import java.util.*;

public class NextRound {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String nk = sc.nextLine();
      String[] nks = nk.split("\\s+");
      int n = Integer.parseInt(nks[0]);
      int k = Integer.parseInt(nks[1]);
      
      String scores = sc.nextLine();
      String[] scr = scores.split("\\s+");
      int count = 0;
      
      for (int i = 0; i< scr.length; i++) {
        if (Integer.parseInt(scr[i]) >= Integer.parseInt(scr[k - 1]) && Integer.parseInt(scr[i]) > 0) {
          count++;
        }
      }
      System.out.println(count);
    }
}
