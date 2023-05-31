import java.util.Scanner;
public class Main05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for(int j = 1; j<=num; j++)
        {
            for(int i = 1; i<=j; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//2438