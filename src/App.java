import board.CreationOfThePieces;
import pieces.King;


public class App {



    public static void main(String[] args) throws Exception {

        CreationOfThePieces create = new CreationOfThePieces();
        create.testPieceLocations();
        create.testIndividualSquare(4, 4);
    }
}
