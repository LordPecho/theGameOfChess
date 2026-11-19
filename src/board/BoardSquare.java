package board;

import pieces.Piece;

/**
 * Class for the Board
 * this will be used to create an array of BoardSquares for a 8x8 array
 *  where each Object in the array will be a BoardSquare
 * 
 * this class and its attributes is subject to change 
 * 
 * @author Almir
 *
 * BoardSquare
 */

public class BoardSquare {

    //coords
    private int row;
    private int col;

    private boolean isEmpty = true; // to be used to check for empty locations for movement
    private Piece piece;

    public BoardSquare(int row, int col, boolean isEmpty, Piece piece){
        this.row = row;
        this.col = col;
        this.isEmpty = isEmpty;
        this.piece = piece;
    }//BoardSquare

    public void setPiece(Piece piece){
        this.piece = piece;
    }//setPiece

    /**
     * Change the state of the Piece, changes if the Piece is Occupied by another Piece 
     */
    public void setEmptyToOccupied(){
        this.isEmpty = false;
    }//setEmptyToOccupied

    /**
     * Change the state of the Piece, changes if the Piece is Occupied by another Piece 
     * TRUE:    Occupied by a piece
     * FALSE:   Not occcupied by a piece, is empty
     * @param occupied (TRUE: Occupied by a piece; FALSE: is empty)
     */
    public void setEmptyToOccupied(boolean occupied){
        this.isEmpty = !occupied;
    }

    public boolean isEmpty(){
        return this.isEmpty;
    }
    public Piece getPiece(){
        return this.piece;
    }

    public void printRowAndCol(){
        System.out.println("row: " + this.row+ "col: " + this.col);
    }
}
