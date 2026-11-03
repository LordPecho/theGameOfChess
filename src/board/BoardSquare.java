package board;

import pieces.Piece;

/**
 * Class for the Board
 * this will be used to create an array of BoardSquares for a 8x8 array
 *  where each Object in the array will be a BoardSquare
 * 
 * this class and it attributes is subject to change 
 * 
 * @author Almir
 *
 * BoardSquare
 */

public class BoardSquare {

    //coords
    private int row;
    private int col;

    private boolean isEmpty; // to be used to check for empty locations for movement
    private Piece piece;

    public BoardSquare(int row, int col, boolean isEmpty, Piece piece){
        this.row = row;
        this.col = col;
        this.isEmpty = isEmpty;
        this.piece = piece;
    }
}
