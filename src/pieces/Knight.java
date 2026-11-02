package pieces;
/**
 * Class for the chess pieces of type: knight
 * 
 * this is a child of => Piece
 * @author Almir
 *
 * Piece
 */

public class Knight extends Piece  {
   
    //The default value = knight
    /**
     * Set the knight piece
     * This is used to set the initial location of the knight
     * 
     * @param row set it to inital knight location(row)
     * @param col set it to inital knight location(collumn)
     * @param isWhite set the color of the Piece true = WHITE; false = BLACK
     */
    public Knight(int row, int col, boolean isWhite){
    super(row, col, isWhite, "knight");
    }

}
