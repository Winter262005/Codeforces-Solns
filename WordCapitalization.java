import java.util.*;

public class WordCapitalization {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine();
    String[] ind = word.split("");
    
    ind[0] = ind[0].toUpperCase();
    
    for (int i = 0; i < ind.length; i++){
      System.out.print(ind[i]);
    }
  }
}
