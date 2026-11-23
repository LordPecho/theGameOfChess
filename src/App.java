import board.CreationOfThePieces;
import pieces.King;
import pieces.Knight;
import pieces.Rook;


public class App {



    public static void main(String[] args) throws Exception {

        Knight knight = new Knight();
        knight.testMovement();

        CreationOfThePieces board = new CreationOfThePieces();
        board.testPieceLocations();
        board.testIndividualSquare(4, 4);
        
        knight.testTheBoardMovement(board.getBoard(), board.getSingleBoardSquare(0, 1));

    }
}
