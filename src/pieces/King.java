package pieces;
/**
 * Class for the chess pieces of type: king
 * 
 * this is a child of => Piece
 * @author Almir
 *
 * Piece
 */

public class King extends Piece  {
    
    //The default value = king
    /**
     * Set the king piece
     * This is used to set the initial location of the king
     * 
     * @param row set it to inital king location(row)
     * @param col set it to inital king location(collumn)
     * @param isWhite set the color of the Piece true = WHITE; false = BLACK
     */
    public King(int row, int col, boolean isWhite){
        // using the parent constructor
        super(row, col, isWhite, "king");
    }

    @Override 
    public boolean getMovement(int rowInput, int colInput){
        if( ((this.getCol() == colInput-1) && 
                ((this.getRow()+1) == rowInput || 
                (this.getRow()-1) == rowInput || 
                (this.getRow()) == rowInput)) ||

             ((this.getCol() == colInput) && 
                ((this.getRow()+1) == rowInput || 
                (this.getRow()-1) == rowInput)) ||

             ((this.getCol() == colInput+1) && 
                ((this.getRow()+1) == rowInput || 
                (this.getRow()-1) == rowInput || 
                (this.getRow()) == rowInput))){
            return true;
        }
        else{
            return false;
        }
    }
}
