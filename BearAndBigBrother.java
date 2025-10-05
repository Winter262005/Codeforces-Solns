import java.util.*;

public class BearAndBigBrother {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String abc = sc.nextLine();
    String[] weights = abc.split("\\s+");
    
    int limakwt = Integer.parseInt(weights[0]);
    int bobwt = Integer.parseInt(weights[1]);
    int years = 0;
    
    while (limakwt <= bobwt) {
      limakwt = limakwt * 3;
      bobwt = bobwt * 2;
      years++;
    }
    
    System.out.println(years);
  }
}
