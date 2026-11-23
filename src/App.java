import board.CreationOfThePieces;
import pieces.King;
import pieces.Knight;
import pieces.Rook;


public class App {



    public static void main(String[] args) throws Exception {

        CreationOfThePieces board = new CreationOfThePieces();
        board.testPieceLocations();
        board.testIndividualSquare(4, 4);

        //better way to test
        //get individual square []
        //Change the content of the (row,col) to test individual squares
        board.getSingleBoardSquare(0, 1)
        //get the piece inside the square[Knight](example)
        .getPiece()
        //actual test for the specific piece
        .testTheBoardMovement(board.getBoard(), board.getSingleBoardSquare(00, 01));;



        //knight.testTheBoardMovement(board.getBoard(), board.getSingleBoardSquare(0, 1));

    }
}
