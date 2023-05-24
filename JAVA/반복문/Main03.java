import java.util.Scanner;
public class Main03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Byte = sc.nextInt();
        String i = "int";
        String l = "long ";
        int p =Byte/4;
        for(int a = 1; a<=p; a++)
        {
            System.out.print(l);
        }
        System.out.println(i);
    }
}
