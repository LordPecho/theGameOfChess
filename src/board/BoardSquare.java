package board;

public class BoardSquare {

    //coords
    private int row;
    private int col;

    /**
     * These will be used for the logic of movementa and attack:
     * 
     * isEmpty 
     * isWhite
     */
    private boolean isEmpty; // to be used to check for empty locations for movement
    private boolean isWhite; // used to check color of piece on the square; used for attack

}
