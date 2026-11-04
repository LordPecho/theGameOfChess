package board;



// Piece and its child imports
import pieces.Piece;
import pieces.Queen;
import pieces.Pawn;
import pieces.Rook;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;

public class CreationOfThePieces {
    
    private BoardSquare board[][] = new BoardSquare[8][8];
    // WHITE PIECES
    private Piece whitePawns[] = new Pawn[8];
    private Piece whiteRooks[] = new Rook[2];
    private Piece whiteKnights[] = new Knight[2];
    private Piece whiteBishops[] = new Bishop[2];
    private Piece whiteQueen = new Queen(0, 4, true);
    private Piece whiteKing = new King(0, 3, true);
    
    //BLACK PIECES
    private Piece blackPawns[] = new Pawn[8];
    private Piece blackRooks[] = new Rook[2];
    private Piece blackKnights[] = new Knight[2];
    private Piece blackBishops[] = new Bishop[2];
    private Piece blackQueen = new Queen(7, 4, true);
    private Piece blackKing = new King(7, 3, true);

    private int counter = 0;

    public void createPieces(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                this.createPawns( i, j);
                this.createRooks(i, j);
                this.createKnights(i, j);
                this.createBishops(i, j);
            }
        }
        
    }



    //TO DO MAKE JAVA DOC
    //create PAWNS
    private void createPawns(int row, int col){
        // Set WHITE
        if(row  == 1){
            this.whitePawns[col] = new Pawn(row, col, true);
            this.setPiece(row, col, whitePawns, col);
        }
        // Set BLACK
        if(row  == 6){
            this.blackPawns[col] = new Pawn(row, col, false);
            this.setPiece(row, col, blackPawns, col);
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

    //create KNIGHTS
    private void createKnights(int row, int col){
        // Set WHITE
        if(row == 0 && (col == 1 || col == 6)){
            this.whiteKnights[counter] = new Knight(row, col, true);
            counter++;
            if(counter>2)
                counter=0;
        }

        // Set BLACK
        if(row == 7 && (col == 1 || col == 6)){
            this.blackKnights[counter] = new Knight(row, col, false);
            counter++;
            if(counter>2)
                counter=0;
        }        

    }

    //create BISHOPS
    private void createBishops(int row, int col){
        // Set WHITE
        if(row == 0 && (col == 2 || col == 5)){
            this.whiteBishops[counter] = new Bishop(row, col, true);
            counter++;
            if(counter>2)
                counter=0;
        }

        // Set BLACK
        if(row == 7 && (col == 2 || col == 5)){
            this.blackBishops[counter] = new Bishop(row, col, false);
            counter++;
            if(counter>2)
                counter=0;
        }
    }



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
    private void setPiece(int row, int col,Piece piece[], int counter){
        this.board[row][col].setPiece(piece[counter]);
    }

}
