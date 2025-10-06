import java.util.*;
 
public class BoyOrGirl {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String[] name1 = name.split("");
    
    Set<String> ind = new HashSet<>();
    
    for (String s : name1){
      ind.add(s);
    }
    
    if (ind.size() % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}
