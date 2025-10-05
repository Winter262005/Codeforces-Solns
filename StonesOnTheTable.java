import java.util.*;

public class StonesOnTheTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    String ord = sc.nextLine();
    String[] order = ord.split("");
    int count = 0;
    
    for (int i = 1; i < order.length; i++){
      if (order[i].equals(order[i - 1])){
        count++;
      }
    }
    System.out.println(count);
  }
}
