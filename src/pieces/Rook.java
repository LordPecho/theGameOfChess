package pieces;

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
    this.setTypeOfPiece ("rook");
    this.setPieceColor(isWhite);
    this.setCord(row, col);
    } 
}
