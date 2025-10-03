import java.util.*;

public class BitPlusPlus {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      sc.nextLine();
      int x = 0;
      for (int i = 0; i < n; i++){
        String stmt = sc.nextLine();
        if (stmt.equals("++X") || stmt.equals("X++")) {
          x++;
        } else if (stmt.equals("--X") || stmt.equals("X--")) {
          x--;
        } else {
          System.out.println("not an expression");
        }
      }
      System.out.println(x);
  }
}
