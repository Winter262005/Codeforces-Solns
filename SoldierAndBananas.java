import java.util.*;

public class SoldierAndBananas {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String line = sc.nextLine();
      String[] input = line.split("\\s+");
      int k = Integer.parseInt(input[0]);
      int n = Integer.parseInt(input[1]);
      int w = Integer.parseInt(input[2]);
      int sum = 0;
      
      for (int i = 1; i < w + 1; i++){
        sum += i*k;
      }
      if (n < sum){
        System.out.println(sum - n);
      } else {
        System.out.println(0);
      }
  }
}
