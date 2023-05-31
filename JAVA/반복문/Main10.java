import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int loop = 1; loop<=count; loop++)
        {
            int st = sc.nextInt();
            int nd = sc.nextInt();
            int sum = st+nd;
            System.out.println("Case #"+loop+": "+st+" + "+nd+" = "+sum);
        }
    }
}
//11022