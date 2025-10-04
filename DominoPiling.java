import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grid = sc.nextLine();
        String[] gr = grid.split("\\s+");
        int m = Integer.parseInt(gr[0]);
        int n = Integer.parseInt(gr[1]);
        int count = (m*n)/2;
        
        System.out.println(count);
    }
}
