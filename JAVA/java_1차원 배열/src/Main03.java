import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        for(int loop = 0; loop<count; loop++)
        {
            array[loop] = sc.nextInt();
        }

        int max = -1000000;
        int min = 1000000;
        for(int loop : array)
        {
            max = Math.max(loop, max);
            min = Math.min(loop, min);
        }
        System.out.println(min+" "+max);
    }
}
//10818