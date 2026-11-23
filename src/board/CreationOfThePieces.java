package board;

// Piece and all of its child imports
import pieces.Piece;
import pieces.Queen;
import pieces.Pawn;
import pieces.Rook;
import pieces.Bishop;
import pieces.King;
import pieces.Knight;

public class CreationOfThePieces {
    
    private BoardSquare board[][] = new BoardSquare[8][8];


    /**
     * Constructor for the start of creation of the board
     */
    public CreationOfThePieces(){
        
            for (int i = 0; i < 8; i++){
                for (int j = 0; j < 8; j++){
                    board[i][j] = new BoardSquare(i, j, true, new EmptySquare());
                    this.createPawns( i, j);
                    this.createRooks(i, j);
                    this.createKnights(i, j);
                    this.createBishops(i, j);
                    this.createQueens(i, j);
                    this.createKings(i, j);
                }
            }
            
            //Just for testing (this line here is just temporary, will be used to test if the Pieces can move)
            //this.setPiece(2, 0, new Pawn(2, 0, false));
    }//CreationOfThePieces



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

    }//createPawns

    // create ROOKS
    private void createRooks(int row, int col){

        // Set WHITE
        if(row == 0 && (col == 0 || col == 7)){
            this.setPiece(row, col, new Rook(row, col, true));
        }
        // Set BLACK
        if(row == 7 && (col == 0 || col == 7)){
            this.setPiece(row, col, new Rook(row, col, false));
        }

    }//createRooks

    // create KNIGHTS
    private void createKnights(int row, int col){

        // Set WHITE
        if(row == 0 && (col == 1 || col == 6)){
            this.setPiece(row, col, new Knight(row, col, true));
        }

        // Set BLACK
        if(row == 7 && (col == 1 || col == 6)){
            this.setPiece(row, col, new Knight(row, col, false));
        }        

    }//createKnights

    // create BISHOPS
    private void createBishops(int row, int col){

        // Set WHITE
        if(row == 0 && (col == 2 || col == 5)){
            this.setPiece(row, col, new Bishop(row, col, true));
        }

        // Set BLACK
        if(row == 7 && (col == 2 || col == 5)){
            this.setPiece(row, col, new Bishop(row, col, false));
        }

    }//createBishops

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

    }//createQueens

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

    }//createKings
    /**
     * Sets the piece to a Inputed piece, and sets it to occupied
     * @param row row of the piece
     * @param col collumn of the piece
     * @param piece Piece object 
     */
    private void setPiece(int row, int col,Piece piece){
        this.board[row][col].setPiece(piece);
        this.board[row][col].setEmptyToOccupied();
    }//setPiece

    /**
     * tests an individual square
     * 
     * @param row ROW id of the piece to be tested
     * @param col COL id of the piece to be tested
     */
    public void testIndividualSquare(int row, int col){
        this.board[row][col].printRowAndCol();
    }//testIndividualSquare
    /**
     * Used to test every piece location
     */
    public void testPieceLocations(){
        for (int i=0; i<8; i++){
            String temp = "";
            for (int j = 0; j<8; j++){
                if(this.board[i][j].isEmpty() != true){
                    if(this.board[i][j].getPiece().getTypeOfPiece() == "pawn")
                        temp = temp + i + j + ": " + this.board[i][j].getPiece().getTypeOfPiece() + "  ";
                    else
                        temp = temp + i + j + ": " + this.board[i][j].getPiece().getTypeOfPiece() + " "; 
                }
                else 
                    temp = temp + i + j + ": " + "empty" + " ";
        }//
        System.out.println(temp +"\n");
            
        }
    }//testPieceLocations()

    public BoardSquare[][] getBoard(){
        return this.board;
    }//getBoard
    public BoardSquare getSingleBoardSquare(int row, int col){
        return this.board[row][col];
    }//getSingleBoardSquare


    /**
     * get individual square []
     * Change the content of the (row,col) to test individual Pieces, 
     * For each Piece to test you need to inster the starting location id (row, col)
     * 
     * @param row row of the Piece for testing
     * @param col col of the Piece for testing
     */
    public void testPieceMovement(int row, int col){
        this.getSingleBoardSquare(row, col)
        .getPiece()
        .testTheBoardMovement(this.getBoard(), this.getSingleBoardSquare(row, col));
    }//testPieceMovement

}//CreationOfThePieces end of class
