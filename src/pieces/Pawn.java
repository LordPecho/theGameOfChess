package pieces;
/**
 * Class for the chess pieces of type: pawn
 * 
 * this is a child of => Piece
 * @author Almir
 *
 * Piece
 */

public class Pawn extends Piece  {

    private int startingRow;

    //The default value = pawn
    /**
     * Set the pawn piece
     * This is used to set the initial location of the pawn
     * 
     * @param row set it to inital pawn location(row)
     * @param col set it to inital pawn location(collumn)
     * @param isWhite set the color of the Piece true = WHITE; false = BLACK
     */
    public Pawn(int row, int col, boolean isWhite){
        // using the parent constructor
        super(row, col, isWhite, "pawn");
        this.startingRow = row;
    }

        
    @Override 
    public boolean getMovement(int rowInput, int colInput){

        if((this.getCol() == colInput && this.getRow()+1 == rowInput && this.getPieceColor()) || 
            (this.getCol() == colInput) && this.getRow()+2 == rowInput && this.getRow() == startingRow && this.getPieceColor() ||
            (this.getCol() == colInput && this.getRow()-1 == rowInput && !this.getPieceColor()) || 
            (this.getCol() == colInput) && this.getRow()-2 == rowInput && this.getRow() == startingRow && !this.getPieceColor()){
            return true;
        }
        else{
            return false;
        }
    }

    public void testPawnMovement(int colInput){

        for(int i=0; i<8; i++){
            System.out.println("Test for ROW: "+ i + " COL: " + colInput + ": " + this.getMovement(i, colInput));
        }
    }

}
