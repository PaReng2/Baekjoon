import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] line = new int[count];
        for(int loop = 1; loop<=count; loop++)
        {
            int input = sc.nextInt();
            line[loop] = input;
        }
        int sum = 0;
        int check = sc.nextInt();
        for(int loop : line)
        {
            if(check == loop)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}