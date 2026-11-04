package pieces;
/**
 * Class for the chess pieces of type: rook
 * 
 * this is a child of => Piece
 * @author Almir
 *
 * Piece
 */


public class Rook extends Piece {
    
    //The default value = rook
    /**
     * Set the rook piece
     * This is used to set the initial location of the rook
     * 
     * @param row set it to inital rook location(row)
     * @param col set it to inital rook location(collumn)
     * @param isWhite set the color of the Piece true = WHITE; false = BLACK
     */
    public Rook(int row, int col, boolean isWhite){
        // using the parent constructor
        super(row, col, isWhite, "rook");
    } 

        @Override 
    public boolean getMovement(int rowInput, int colInput){

        if(this.getRow()==rowInput || this.getCol()==colInput){
            return true;
        }
        else{
            return false;
        }
    }

}
