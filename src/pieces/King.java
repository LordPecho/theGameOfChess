package pieces;

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
    this.setTypeOfPiece ("king");
    this.setPieceColor(isWhite);
    this.setCord(row, col);
    }

}
