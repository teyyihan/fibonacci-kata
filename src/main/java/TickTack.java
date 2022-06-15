import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TickTack {

    private final String[][] board = new String[3][3];

    public String[][] play(String player, int xPosition, int yPosition) {
        String position = board[xPosition][yPosition];
        if (position != null) {
            throw new InvalidParameterException("position is already taken");
        }

        board[xPosition][yPosition] = player;
        return board;
    }

}
