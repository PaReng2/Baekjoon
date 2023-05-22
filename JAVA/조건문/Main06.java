package src;
import java.util.Scanner;
public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int O = sc.nextInt();

        if (M+O>=60)
        {
        int a = M+O;
            M = a%60;
            H = H+(a/60);
            if(H>=24){H=H%24;}
            System.out.println(H + " " + M);
        }
        else
        {

            M = M+O;
            System.out.println(H+" "+M);

        }

    }
}

//도움을 주신분: 전설의 문어