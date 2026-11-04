import pieces.Bishop;
import pieces.Pawn;
import pieces.Queen;
import pieces.Rook;



public class App {



    public static void main(String[] args) throws Exception {

        //MOVE THIS TO A SEPERATE CLASS AND MAKE IT
        Pawn whitePawn01 = new Pawn(1, 0, true);

        //Uncomment for test
        // whitePawn01.testPawnMovement();


        Rook rook01 = new Rook(0,0,true);
        // rook01.testRookMovement();
        
        Bishop bishop01 = new Bishop(4,4,true);
        // bishop01.testMovement();

        Queen queen01 = new Queen(4, 4, false);
        queen01.testMovement();
    }
}
