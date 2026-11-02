package pieces;
/**
 * Class for the chess pieces of type: queen
 * 
 * this is a child of => Piece
 * @author Almir
 *
 * Piece
 */

public class Queen extends Piece  {
    
    
    //The default value = queen
    /**
     * Set the queen piece
     * This is used to set the initial location of the queen
     * 
     * @param row set it to inital queen location(row)
     * @param col set it to inital queen location(collumn)
     * @param isWhite set the color of the Piece true = WHITE; false = BLACK
     */
    public Queen(int row, int col, boolean isWhite){
        // using the parent constructor
        super(row, col, isWhite, "queen");
    } 
}
