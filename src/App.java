import pieces.Pawn;
import pieces.Rook;
import tests.*;
import pieces.Pawn.*;

public class App {



    public static void main(String[] args) throws Exception {

        //MOVE THIS TO A SEPERATE CLASS AND MAKE IT
        Pawn whitePawn01 = new Pawn(1, 0, true);

        //Uncomment for test
        // whitePawn01.testPawnMovement();


        Rook rook01 = new Rook(0,0,true);
        // rook01.testRookMovementColInput(0);
        // rook01.testRookMovementRowInput(0);
        // System.out.print(rook01.getMovement(1, 1));
        rook01.testRookMovement();

    }
}
