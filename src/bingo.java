import java.util.Random;

public class bingo {
    public static void main(String[] args) {

        int[][] bingo = new int[5][5];
        Random rand = new Random();
        int number;
        int noNumber = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                do {
                    number = (j*15) + 1 + rand.nextInt(5);

                } while (number == bingo[0][0] || number == bingo[0][1] || number == bingo[0][2] || number == bingo[0][3] || number == bingo[0][4] ||
                        number == bingo[1][0] || number == bingo[1][1] || number == bingo[1][2] || number == bingo[1][3] || number == bingo[1][4] ||
                        number == bingo[2][0] || number == bingo[2][1] || number == bingo[2][2] || number == bingo[2][3] || number == bingo[2][4] ||
                        number == bingo[3][0] || number == bingo[3][1] || number == bingo[3][2] || number == bingo[3][3] || number == bingo[3][4] ||
                        number == bingo[4][0] || number == bingo[4][1] || number == bingo[4][2] || number == bingo[4][3] || number == bingo[4][4]);
                if (i != 2 || j != 2) {
                    bingo[i][j]=number;
                    bingo[2][2]=noNumber;
                    System.out.print(bingo[i][j] + " ");
                }
               else {System.out.print("   ");}
            }
            System.out.println();
        }
    }
}
