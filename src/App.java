import board.CreationOfThePieces;
import pieces.Bishop;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;



public class App {



    public static void main(String[] args) throws Exception {

        // Queen queen01 = new Queen(4, 4, false);
        // queen01.testMovement();

        CreationOfThePieces create = new CreationOfThePieces();
        create.testPieceLocations();
        create.testIndividualSquare(4, 4);
    }
}
