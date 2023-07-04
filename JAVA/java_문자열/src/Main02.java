import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        for (int loop = 0; loop<count; loop++)
        {
            String array = sc.next();

            System.out.print(array.charAt(0));
            System.out.println(array.charAt(array.length()-1));
        }

    }
}
//9086