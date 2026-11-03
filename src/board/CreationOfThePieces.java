package board;



// Piece and its child imports
import pieces.Piece;
import pieces.Queen;
import pieces.Pawn;
import pieces.Rook;
import pieces.Bishop;
import pieces.King;

public class CreationOfThePieces {
    
    private BoardSquare square[][] = new BoardSquare[8][8];
    // WHITE PIECES
    private Piece whitePawns[] = new Pawn[8];
    private Piece whiteRooks[] = new Rook[2];
    private Piece whiteBishops[] = new Bishop[2];
    private Piece whiteQueen = new Queen(0, 4, true);
    private Piece whiteKing = new King(0, 3, true);
    
    //BLACK PIECES
    private Piece blackPawns[] = new Pawn[8];
    private Piece blackRooks[] = new Rook[2];
    private Piece blackBishops[] = new Bishop[2];
    private Piece blackQueen = new Queen(7, 4, true);
    private Piece blackKing = new King(7, 3, true);

    private int counter = 0;

    public void createPieces(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                createPawns( i, j);
                createRooks(i, j);
                //Set WHITE pieces
                //Set white Pawns
                //Set BLACK pieces
                //Set black Pawns
            }
        }
        Pawn pawn = new Pawn(1, 0, true);
        square[0][0] = new BoardSquare(1,0,false,pawn); 
    }

    //TO DO MAKE JAVA DOC
    //create PAWNS
    private void createPawns(int row, int col){
        // Set WHITE
        if(row  == 1){
            this.whitePawns[col] = new Pawn(row, col, true);
        }
        // Set BLACK
        if(row  == 6){
            this.blackPawns[col] = new Pawn(row, col, false);
        }
    }

    //create ROOKS
    private void createRooks(int row, int col){
        // Set WHITE
        if(row == 0 && (col == 0 || col == 7)){
            this.whiteRooks[counter] = new Rook(row, col, true);
            counter++;
            if(counter>2)
                counter=0;
        }
        // Set BLACK
        if(row == 7 && (col == 0 || col == 7)){
            this.blackRooks[counter] = new Rook(row, col, true);
            counter++;
            if(counter>2)
                counter=0;
        }
    }
    private void createKnights(int row, int col){}
    private void createBishops(int row, int col){}



    //   for (int i=0; i<8; i++){
    //         String temp = "";
    //         for (int j = 0; j<8; j++){
    //             if(getMovement_i_j){
    //                 temp= temp + i + j + "T" +" ";
    //             }else{
    //                 temp= temp + i + j + "F" +" ";
    //             }
                
    //         }
    //         System.out.println(temp +"\n");
            
    //     }
        

}
