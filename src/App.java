import board.CreationOfThePieces;
import pieces.King;


public class App {



    public static void main(String[] args) throws Exception {

        // Queen queen01 = new Queen(4, 4, false);
        // queen01.testMovement();

        King king01 = new King(4,4, false);
        king01.testMovement();
        // CreationOfThePieces create = new CreationOfThePieces();
        // create.testPieceLocations();
        // create.testIndividualSquare(4, 4);
    }
}
