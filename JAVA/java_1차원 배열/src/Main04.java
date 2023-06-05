import java.util.Scanner;
public class Main04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[9];

        for(int loop = 0; loop<9; loop++)
        {
            array[loop] = sc.nextInt();
        }
        int max = 0;
        for(int loop:array)
        {
            max = Math.max(loop, max);
        }

        System.out.println(max);
        for(int loop=0; loop<9; loop++)
        {
            if(array[loop]==max)
            {
                System.out.println(loop+1);
            }
        }

    }
}
