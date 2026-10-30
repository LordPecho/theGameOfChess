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
    this.setTypeOfPiece ("pawn");
    this.setPieceColor(isWhite);
    this.setCord(row, col);
    }
}
