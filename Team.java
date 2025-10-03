import java.util.*;

public class Team {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      sc.nextLine();
      int nums = 0;
      for (int i = 0; i < n; i++){
        int sum = 0;
        String line = sc.nextLine();
        String[] nos = line.split("\\s+");
        
        for (String s : nos) {
          if (!s.isEmpty()) {
            sum += Integer.parseInt(s);
          }
        }
        
        if (sum > 1){
          nums++;
        }
      }
      System.out.println(nums);
  }
}
