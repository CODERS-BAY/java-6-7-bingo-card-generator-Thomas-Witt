import java.util.Random;

public class Bingo2 {
    public static void main(String[] args) {

        int[][] bingo = new int[5][5];
        Random rand = new Random();
        int temp;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==2 && j==2) {
                    System.out.print("   ");
                }else {
                    do {
                        temp = (j * 15) + (rand.nextInt(15) + 1);
                    } while (temp == bingo[0][j] || temp == bingo[1][j] || temp == bingo[2][j] || temp == bingo[3][j] || temp == bingo[4][j]);
                    bingo[i][j] = temp;
                    System.out.printf("%3d", bingo[i][j]);
                }
            }
            System.out.println();
        }
    }
}
