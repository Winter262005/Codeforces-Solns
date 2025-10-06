import java.util.*;

public class Elephant{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int dist = sc.nextInt();
     
     int steps = dist / 5;
     if (dist % 5 != 0) {
       steps++;
     }

     System.out.println(steps);
  }
}
