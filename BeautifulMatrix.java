import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int m = -1;
      int n = -1;

      for (int i = 0; i < 5; i++){
        String rows = sc.nextLine();
        String[] indval = rows.split("\\s+");
        
        for (int j = 0; j < 5; j++){
          int value = Integer.parseInt(indval[j]);
          
          if (value == 1){
            m = i;
            n = j;
            break;
          }
        }
        if (m == i) {
          break;
        }
        
      }
      
      int steps = Math.abs(2 - m) + Math.abs(2 - n);
      System.out.println(steps);
      
  }
}
