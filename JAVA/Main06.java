import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bord[] = {0, 0, 0, 0, 0, 0};
        for(int loop = 1; loop<=6; loop++)
        {
            int chess  = sc.nextInt();
            bord[loop] = chess;
        }

        for(int loop:bord)
        {
            
        }

    }
}
