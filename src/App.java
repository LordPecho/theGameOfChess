import pieces.Pawn;
import pieces.Pawn.*;

public class App {



    public static void main(String[] args) throws Exception {

        Pawn whitePawn01 = new Pawn(1, 0, true);
        Pawn blackPawn01 = new Pawn(6,0,false);

        System.out.print("Test for whitePawn01:\n");
        whitePawn01.testPawnMovement(0);
        System.out.print("Test for blackPawn01:\n");
        blackPawn01.testPawnMovement(0);

    }
}
