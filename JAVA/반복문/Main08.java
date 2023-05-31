import java.util.Scanner;
public class Main08 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        while (true)
        {
            int st = sc.nextInt();
            int nd = sc.nextInt();

            if (st == 0 && nd == 0)
            {
                break;
            }
            else
            {
                System.out.println(st + nd);
            }
        }
    }
}
//10952
