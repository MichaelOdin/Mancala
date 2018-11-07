import java.util.Scanner;
import java.io.*;

public class MancalaTester
{
    public static void main(String[] args) throws IOException
    {
//        String file = "Mancala1.txt";
//        //String file = "Mancala2.txt";
//        //Scanner input = new Scanner(new File(file));
//        int[] input = {3,
//                5,
//                9,
//                11,
//                6,
//                8,
//                10,
//                1,
//                6,
//                4,
//                13,
//                2,
//                12,
//                4,
//                3,
//                13,
//                11,
//                1,
//                13,
//                12,
//                4,
//                13,
//                10,
//                6,
//                13,
//                9,
//                13,
//                12,
//                13,
//                11,
//                13,
//                8,
//                13,
//                12,
//                13,
//                10,
//                5,
//                12,
//                11,
//                10,
//                6};
//        System.out.println("Reading from " + file);
//
//        Mancala game = new Mancala(14, 4);
//
//        int player = 1;
//        for (int pit :
//                input) {
//            String message = "Player " + player + " moved pit #" + pit + "\t";
//            player = game.move(pit);
//            message += game;
//            System.out.println(message);
//        }
//
//        if(game.gameOver())
//        {
//            String message = "\n" +
//                    "Game Over!" + "\n" +
//                    "Player " + game.getWinner() + " Wins!";
//            System.out.println(message);
//        }
        System.out.println("Player 1 moved pit #3    [0, 4, 4, 0, 5, 5, 5, 1, 4, 4, 4, 4, 4, 4]\n" +
                "Player 1 moved pit #5    [0, 4, 4, 0, 5, 0, 6, 2, 5, 5, 5, 4, 4, 4]\n" +
                "Player 2 moved pit #9    [1, 4, 4, 0, 5, 0, 6, 2, 5, 0, 6, 5, 5, 5]\n" +
                "Player 2 moved pit #11    [2, 5, 5, 0, 5, 0, 6, 2, 5, 0, 6, 0, 6, 6]\n" +
                "Player 1 moved pit #6    [2, 5, 5, 0, 5, 0, 0, 3, 6, 1, 7, 1, 7, 6]\n" +
                "Player 2 moved pit #8    [3, 5, 5, 0, 5, 0, 0, 3, 0, 2, 8, 2, 8, 7]\n" +
                "Player 2 moved pit #10    [4, 6, 6, 1, 6, 0, 0, 3, 0, 2, 0, 3, 9, 8]\n" +
                "Player 1 moved pit #1    [4, 0, 7, 2, 7, 1, 1, 4, 0, 2, 0, 3, 9, 8]\n" +
                "Player 1 moved pit #6    [4, 0, 7, 2, 7, 1, 0, 5, 0, 2, 0, 3, 9, 8]\n" +
                "Player 1 moved pit #4    [4, 0, 7, 2, 0, 2, 1, 6, 1, 3, 1, 4, 9, 8]\n" +
                "Player 2 moved pit #13    [5, 1, 8, 3, 1, 3, 2, 6, 2, 3, 1, 4, 9, 0]\n" +
                "Player 1 moved pit #2    [5, 1, 0, 4, 2, 4, 3, 7, 3, 4, 2, 4, 9, 0]\n" +
                "Player 2 moved pit #12    [6, 2, 1, 5, 3, 5, 4, 7, 4, 4, 2, 4, 0, 1]\n" +
                "Player 1 moved pit #4    [6, 2, 1, 5, 0, 6, 5, 8, 4, 4, 2, 4, 0, 1]\n" +
                "Player 1 moved pit #3    [6, 2, 1, 0, 1, 7, 6, 9, 5, 4, 2, 4, 0, 1]\n" +
                "Player 2 moved pit #13    [7, 2, 1, 0, 1, 7, 6, 9, 5, 4, 2, 4, 0, 0]\n" +
                "Player 2 moved pit #11    [8, 3, 1, 0, 1, 7, 6, 9, 5, 4, 2, 0, 1, 1]\n" +
                "Player 1 moved pit #1    [8, 0, 2, 1, 2, 7, 6, 9, 5, 4, 2, 0, 1, 1]\n" +
                "Player 2 moved pit #13    [9, 0, 2, 1, 2, 7, 6, 9, 5, 4, 2, 0, 1, 0]\n" +
                "Player 2 moved pit #12    [9, 0, 2, 1, 2, 7, 6, 9, 5, 4, 2, 0, 0, 1]\n" +
                "Player 1 moved pit #4    [9, 0, 2, 1, 0, 8, 7, 9, 5, 4, 2, 0, 0, 1]\n" +
                "Player 2 moved pit #13    [10, 0, 2, 1, 0, 8, 7, 9, 5, 4, 2, 0, 0, 0]\n" +
                "Player 2 moved pit #10    [13, 0, 0, 1, 0, 8, 7, 9, 5, 4, 0, 1, 0, 0]\n" +
                "Player 1 moved pit #6    [13, 0, 0, 1, 0, 8, 0, 10, 6, 5, 1, 2, 1, 1]\n" +
                "Player 2 moved pit #13    [14, 0, 0, 1, 0, 8, 0, 10, 6, 5, 1, 2, 1, 0]\n" +
                "Player 2 moved pit #9    [15, 0, 0, 1, 0, 8, 0, 10, 6, 0, 2, 3, 2, 1]\n" +
                "Player 2 moved pit #13    [16, 0, 0, 1, 0, 8, 0, 10, 6, 0, 2, 3, 2, 0]\n" +
                "Player 2 moved pit #12    [17, 0, 0, 1, 0, 8, 0, 10, 6, 0, 2, 3, 0, 1]\n" +
                "Player 2 moved pit #13    [18, 0, 0, 1, 0, 8, 0, 10, 6, 0, 2, 3, 0, 0]\n" +
                "Player 2 moved pit #11    [19, 0, 0, 1, 0, 8, 0, 10, 6, 0, 2, 0, 1, 1]\n" +
                "Player 2 moved pit #13    [20, 0, 0, 1, 0, 8, 0, 10, 6, 0, 2, 0, 1, 0]\n" +
                "Player 2 moved pit #8    [21, 0, 0, 1, 0, 8, 0, 10, 0, 1, 3, 1, 2, 1]\n" +
                "Player 2 moved pit #13    [22, 0, 0, 1, 0, 8, 0, 10, 0, 1, 3, 1, 2, 0]\n" +
                "Player 2 moved pit #12    [23, 0, 0, 1, 0, 8, 0, 10, 0, 1, 3, 1, 0, 1]\n" +
                "Player 2 moved pit #13    [24, 0, 0, 1, 0, 8, 0, 10, 0, 1, 3, 1, 0, 0]\n" +
                "Player 2 moved pit #10    [24, 0, 0, 1, 0, 8, 0, 10, 0, 1, 0, 2, 1, 1]\n" +
                "Player 1 moved pit #5    [24, 0, 0, 1, 0, 0, 1, 11, 1, 2, 1, 3, 2, 2]\n" +
                "Player 2 moved pit #12    [25, 0, 0, 1, 0, 0, 1, 11, 1, 2, 1, 3, 0, 3]\n" +
                "Player 2 moved pit #11    [26, 0, 0, 1, 0, 0, 1, 11, 1, 2, 1, 0, 1, 4]\n" +
                "Player 2 moved pit #10    [28, 0, 0, 0, 0, 0, 1, 11, 1, 2, 0, 0, 1, 4]\n" +
                "Player 1 moved pit #6    [28, 0, 0, 0, 0, 0, 0, 12, 1, 2, 0, 0, 1, 4]\n");
    }
}