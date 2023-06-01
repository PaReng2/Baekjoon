package src;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Integer[] line = new Integer[count];//배열 자릿수 할당
        for(int loop = 0; loop<count; loop++)
        {
            int input = sc.nextInt();
            line[loop] = input;
        }//배열에 하나씩 입력
        int sum = 0;
        int check = sc.nextInt(); //찾을 값 할당
        for(int loop : line)
        {
            if(check == loop)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
}