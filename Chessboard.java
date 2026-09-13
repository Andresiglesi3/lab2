// Check if a coordinate is within chessboard boundaries
// Has a CONSTANT_MAX_ROW = 8 and MIN_ROW = 1
// Method called boolean withinChessboard(column, row)
// Verify that the current and target positions of a chess piece are correct

// Important note: Make sure in the main to have all the columns in uppercase letters

public class Chessboard{
    public static int MAX_ROW = 8;
    public static int MIN_ROW = 1;

    public boolean withinChessboard(char column, int row){
        boolean validColumn = (column >= 'A' && column <= 'H');
        boolean validRow = (row >= MIN_ROW && row <= MAX_ROW);
        return validColumn && validRow;
    }
}