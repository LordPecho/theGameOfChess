package board;

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
    private boolean isWhite; // used to check color of piece on the square; used for attack

}
