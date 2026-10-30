package pieces;
/**
 * Class for the chess pieces
 * @author Almir
 *
 * Piece
 */


public class Piece {
    
    //attribute(marker) to check piece color
    private Boolean isWhite;
    //attribute(marker) to check if the piece is selected
    private Boolean isSelected;
    //attributes(markers) that indicate the location of the piece 
    private int row;
    private int col;

    //The geter Methods:
        /**
     * Returns the row of this piece
     * @return row (int)
     * 
     * getType
     */
    public int getRow(){
        return this.row;
    }
           /**
     * Returns the collumn of this piece
     * @return col (int)
     * 
     * getType
     */
    public int getCol(){
        return this.col;
    }

    //The setter Methods:
    /**
     * Method to set the initial coordinates(board location) of the piece
     * @param newRow row of the piece
     * @param newCol collumn of the piece
     */
    public void setCord(int newRow, int newCol){
        this.row = newRow;
        this.col = newCol;
    }
   
}
