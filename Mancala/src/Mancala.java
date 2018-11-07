import java.sql.SQLOutput;
import java.util.Arrays;

public class Mancala
{
    private int[] board;
//    private int m2 = 0;
//    private int m1 = (board.length / 2);
//     int[] p1 = Arrays.copyOfRange(board, 1, 7);
//     int[] p2 = Arrays.copyOfRange(board, 8, 13);
    /**
     * Constructs a Mancala object using the specified
     * board length and seeds.
     *
     * Each pit will contain the specified number of seeds.
     * Each mancala will contain 0 seeds.
     *
     * Precondition: boardLength is a even number > 1.
     *
     * @param boardLength total number of pits including mancalas
     * @param seeds number of seeds to put in the non-mancala pits
     */
    public Mancala(int boardLength, int seeds)
    {
        int mancalaP1 = 7;
        int mancalaP2 = 0;
        board = new int[boardLength];
        Arrays.fill(board, seeds);
        board[mancalaP1] = 0;
        board[mancalaP2] = 0;

    }

    /**
     * @param player
     * @return total number of seeds in the specified
     * 			player's pits (not counting mancala seeds)
     */
    public int getSeeds(int player)
    {
        int[] p1 = Arrays.copyOfRange(board, 1, 7);
        int[] p2 = Arrays.copyOfRange(board, 8, 13);
        int sum = 0;
        if(player == 1){
            for (int i = 0; i < p1.length; i++) {
                sum += p1[i];
            }
        }
        else {
            for (int i = 0; i < p2.length; i++) {
                sum += p2[i];
            }
        }
        return sum;
    }

    /**
     * @return board
     */
    public int[] getBoard()
    {
        return board;
    }

    /**
     * Simulates a Mancala move by removing all the seeds from the
     * specified pit and "sowing" them into the subsequent pits.
     * This method will detect and execute a capture if one exists.
     *
     * Precondition: board[pit] > 0
     * Precondition: 0 < pit < board.length / 2
     * 				 board.length / 2 < pit < board.length
     *
     * @param pit
     * @return 1 if Player 1 should move next
     * 		   2 if Player 2 should move next
     */
    public int move(int pit)
    {
         int m2 = 0;
         int m1 = (board.length / 2);
        int player = whosePit(pit);

        int mancala;
        int mancalaOther;

        if (player == 2) {
            mancala = m2;
            mancalaOther = m1;
        } else {
            mancala = m1;
            mancalaOther = m2;
        }

        int seeds = board[pit];
        board[pit] = 0;

        int arrayIndex = pit;
        int i = pit;


        while (seeds > 0){
            if (1 > board.length){
                i = i - board.length;
            } else {
                i += 1;
            }

            board[i] = board[i] + 1;

            seeds--;

        }
        if (seeds == 0 && board[i] == mancala){
            return player;
        }
        else {
            if (player == 1){
                return 1;
            }
            else {
                return 2;
            }
        }
    }

    /**
     * Precondition: 0 <= pit < board.length
     *
     * @param pit
     * @return 1 or 2 depending on which player pit belongs to
     */
    private int whosePit(int pit)
    {
        if (pit <= (board.length / 2)){
            return 1;
        }
        else {
            return 2;
        }
    }

    /**
     * @return 1 if Player 1 is the winner,
     *         2 if Player 2 is the winner,
     *         0 if the game is not over.
     */
    public int getWinner()
    {
         int m2 = 0;
         int m1 = (board.length / 2);
        if ((board[m1] < board[m2])){
            return 1;
        }
        else if ((board[m1] < board[m2])){
            return 2;
        }
        else {
            return 0;
        }

    }

    /**
     * Returns true if the game is over, false otherwise.
     * The game is over if a player cannot make a move i.e.
     * there are no seeds on their side of the board.
     *
     * @return true if the game is over, false otherwise.
     */
    public boolean gameOver()
    {
        int[] p1 = Arrays.copyOfRange(board, 1, 7);
        int[] p2 = Arrays.copyOfRange(board, 8, 13);
        if (p1.equals(0) || p2.equals(0)){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @return the contents of board
     */
    @Override
    public String toString()
    {
        return super.toString();
    }
}