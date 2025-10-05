import java.util.*;

public class HelpfulMaths {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String exp = sc.nextLine();
    String[] expr = exp.split("\\+");
    
    Arrays.sort(expr);
    
    for (int i = 0; i < expr.length - 1; i++){
      System.out.print(expr[i] + "+");
    }
    System.out.print(expr[expr.length-1]);
  }
}
