import java.math.BigInteger;

public class Grains {

    public static void testArgument (int testSquare) {
        if (testSquare < 1 || testSquare > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
    }

    public static BigInteger grainsOnSquare (int square) {
        testArgument(square);

        BigInteger [][] squareBoard = new BigInteger[square][2];

        for (int i = 0; i < squareBoard.length; i++) {
            squareBoard[i][0] = BigInteger.valueOf((i+1));
        }
        squareBoard[0][1] = BigInteger.valueOf(1);

        for (int i = 0; i < squareBoard.length; i++){
            squareBoard[i][1] = BigInteger.valueOf(2).pow(i);
        }

        return squareBoard[squareBoard.length-1][1];

    }
}
