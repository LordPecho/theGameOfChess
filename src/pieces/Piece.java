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
     * 
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
     * 
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
    public void getAttack(int row, int col){
        //attacking logic
    }


    /**
     * Sets the type of piece should only be: pawn; rook; knight; bishop; queen; king
     * 
     * @param type this is the type of piece, can be: pawn; rook; knight; bishop; queen; king
     */
    protected void setTypeOfPiece(String type){
        this.typeOfPiece = type;
    }

    /**
     * gets type of piece should only be: pawn; rook; knight; bishop; queen; king
     * 
     * @return typeOfPiece can be: pawn; rook; knight; bishop; queen; king
     */
    public String getTypeOfPiece(){
        return this.typeOfPiece;
    }

    /**
     * Returns boolean for if the piece is selected
     * 
     * @return isSelected return true/false if the piece is selected
     */
    public boolean getIsSelected(){
        return this.isSelected;
    }

    /**
     * Set if the specific piece isSelected
     * 
     * this is not implemented and is subject to change;
     * 
     * @param isSelected
     */
    public void setIsSelected(boolean isSelected){
        this.isSelected = isSelected;
    }
   
    /**
     * Set piece color white or black(true or false)
     * to set the piece color to white must be set to true
     * to set the piece color to black must be set to false
     * @param isWhite boolean value true = WHITE; false = BLACK
     */
    protected void setPieceColor(boolean isWhite){
        this.isWhite = isWhite;
    }

    /**
     * Returns the color of the piece
     * note: not the actual color but returns boolean
     * true = WHITE; false = BLACK
     * 
     * @return this.isWhite - return the check for the color of the piece(true = WHITE; false = BLACK)
     */
    public boolean getPieceColor(){
        return this.isWhite;
    }
}
