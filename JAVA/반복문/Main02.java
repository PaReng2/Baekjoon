import java.util.Scanner;
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=b; i++)
        {
            long c = sc.nextLong();
            int d = sc.nextInt();
            sum += d * c;

        }
        if(sum==a)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
