package pieces;
/**
 * Class for the chess pieces
 * @author Almir
 *
 * Piece
 */


public class Piece {
    
    private String typeOfPiece;
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

    /**
     * This method is meant to be overriden in the Child to make the logic for the movement for each Piece
     * 
     * @param row the row number of the piece
     * @param col the collumn number of the piece
     */
    public void getMovement(int row, int col){
        //Empty for now
    }

    protected void setTypeOfPiece(String type){
        this.typeOfPiece = type;
    }

    public String getTypeOfPiece(){
        return this.typeOfPiece;
    }

    public boolean getIsSelected(){
        return this.isSelected;
    }

    public void setIsSelected(boolean isSelected){
        this.isSelected = isSelected;
    }
   
    /**
     * Set piece color white or black(true or false)
     * to set the piece color to white must be set to true
     * to set the piece color to black must be set to false
     * @param isWhite boolean value true = white; false = black
     */
    protected void setPieceColor(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean getPieceColor(){
        return this.isWhite;
    }
}
