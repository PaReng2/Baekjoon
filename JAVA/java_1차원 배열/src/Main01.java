package src;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        Integer[] line = new Integer[N];

        for(int loop = 0; loop<N; loop++)
        {
            int input = sc.nextInt();
            line[loop] = input;
        }

        for(int loop:line)
        {
            if(loop < X)
            {
                System.out.print(loop+" ");
            }
        }

    }
}
//10871