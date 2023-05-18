import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        Random random = new Random();

        System.out.println("생성된 로또 번호는 다음과 같습니다.");

        for(int i=0; i<6; i++) {
            lotto[i] = random.nextInt(45)+1;
            for(int j=0; j<i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }

        for (int i=0; i<6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}