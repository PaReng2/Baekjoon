import java.util.Scanner;
public class Main08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        if (dice1 == dice2 && dice2 == dice3 && dice1 == dice3)
        {
            int all = 10000+dice1*1000;
            System.out.println(all);
        }

        else if(dice1==dice2 && dice2!=dice3)
        {
            int half = 1000+dice1*100;
            System.out.println(half);
        }

        else if(dice2==dice3 && dice1!=dice2)
        {
            int half = 1000+dice2*100;
            System.out.println(half);
        }

        else if(dice1!=dice2 && dice2!=dice3 && dice1!=dice3)
        {
            if(dice1>dice2 && dice1>dice3)
            {
                System.out.println(dice1*100);
            }

            else if(dice2>dice1 && dice2>dice3)
            {
                System.out.println(dice2*100);
            }

            else
            {
                System.out.println(dice3*100);
            }
        }
    }
}