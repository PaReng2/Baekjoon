import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bord[] = {1, 1, 2, 2, 2, 8};
        for (int loop = 0; loop < 6; loop++) {
            int chess = sc.nextInt();
            if (chess == bord[loop]) {
                System.out.print(0 + " ");
            } else {
                System.out.print((bord[loop] - chess) + " ");
            }
        }

    }
}
//3003