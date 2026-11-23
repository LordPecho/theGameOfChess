package board;

import pieces.Piece;

public class EmptySquare extends Piece{

    @Override
    public boolean getMovement(int row, int col) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("This Piece should not move'");
    }//getMovement

    @Override
    public boolean getMovement(BoardSquare newSquare, BoardSquare oldSquare) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMovement'");
    }
    
}
