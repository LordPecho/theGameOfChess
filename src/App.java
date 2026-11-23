import board.CreationOfThePieces;


public class App {



    public static void main(String[] args) throws Exception {

        CreationOfThePieces board = new CreationOfThePieces();
        board.testPieceLocations();
        board.testIndividualSquare(4, 4);

        board.testPieceMovement(0, 1);

        //knight.testTheBoardMovement(board.getBoard(), board.getSingleBoardSquare(0, 1));

    }
}
