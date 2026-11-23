import board.CreationOfThePieces;
import pieces.King;
import pieces.Knight;
import pieces.Rook;


public class App {



    public static void main(String[] args) throws Exception {

        Rook rook = new Rook(0, 0, false);
        rook.testMovement();

        CreationOfThePieces create = new CreationOfThePieces();
        create.testPieceLocations();
        create.testIndividualSquare(4, 4);
    }
}
