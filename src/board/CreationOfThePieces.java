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
    private Piece whiteQueen = new Queen(0, 4, true);
    private Piece whiteKing = new King(0, 3, true);
    
    //BLACK PIECES

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
                this.createQueens(i, j);
                this.createKings(i, j);
            }
        }
        
    }



    //TO DO MAKE JAVA DOC
    //create PAWNS
    private void createPawns(int row, int col){

        // Set WHITE
        if(row  == 1){
            this.setPiece(row, col, new Pawn(row, col, true));
        }
        // Set BLACK
        if(row  == 6){
            this.setPiece(row, col, new Pawn(row, col, false));
        }

    }

    //create ROOKS
    private void createRooks(int row, int col){

        // Set WHITE
        if(row == 0 && (col == 0 || col == 7)){
            this.setPiece(row, col, new Rook(row, col, true));
        }
        // Set BLACK
        if(row == 7 && (col == 0 || col == 7)){
            this.setPiece(row, col, new Rook(row, col, false));
        }

    }

    //create KNIGHTS
    private void createKnights(int row, int col){

        // Set WHITE
        if(row == 0 && (col == 1 || col == 6)){
            this.setPiece(row, col, new Knight(row, col, true));
        }

        // Set BLACK
        if(row == 7 && (col == 1 || col == 6)){
            this.setPiece(row, col, new Knight(row, col, false));
        }        

    }

    //create BISHOPS
    private void createBishops(int row, int col){

        // Set WHITE
        if(row == 0 && (col == 2 || col == 5)){
            this.setPiece(row, col, new Bishop(row, col, true));
        }

        // Set BLACK
        if(row == 7 && (col == 2 || col == 5)){
            this.setPiece(row, col, new Bishop(row, col, false));
        }

    }

    // create Queens
    private void createQueens(int row, int col){

        // Set WHITE
        if(row == 0 && col == 4){
            this.setPiece(row, col, new Queen(row, col, true));
        }

        // Set BLACK
        if(row == 7 && col == 4){
            this.setPiece(row, col, new Queen(row, col, false));
        }

    }

    // create KINGS
    private void createKings(int row, int col){

        // Set WHITE
        if(row == 0 && col == 3){
            this.setPiece(row, col, new King(row, col, true));
        }

        // Set BLACK
        if(row == 7 && col == 3){
            this.setPiece(row, col, new King(row, col, false));
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
    private void setPiece(int row, int col,Piece piece){
        this.board[row][col].setPiece(piece);
    }

}
