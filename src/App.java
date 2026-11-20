import board.CreationOfThePieces;
import pieces.King;
import pieces.Knight;


public class App {



    public static void main(String[] args) throws Exception {

        Knight knight = new Knight(7, 1, false);
        knight.testMovement();
        // CreationOfThePieces create = new CreationOfThePieces();
        // create.testPieceLocations();
        // create.testIndividualSquare(4, 4);
    }
}
