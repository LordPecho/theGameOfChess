
package pieces;
/**
 * Class for the chess pieces of type: bishop
 * 
 * this is a child of => Piece
 * @author Almir
 *
 * Piece
 */

public class Bishop extends Piece {
    
    
    //The default value = bishop
    /**
     * Set the bishop piece
     * This is used to set the initial location of the bishop
     * 
     * @param row set it to inital bishop location(row)
     * @param col set it to inital bishop location(collumn)
     * @param isWhite set the color of the Piece true = WHITE; false = BLACK
     */
    public Bishop(int row, int col, boolean isWhite){
    this.setTypeOfPiece ("BISHOP");
    this.setPieceColor(isWhite);
    this.setCord(row, col);
    }

}
