import java.security.InvalidParameterException;

public class TicTac {

    private final String[][] board = new String[3][3];
    private String lastPlayedPlayer;
    public String[][] play(Move move) {

        if(move.getPlayer().equals(lastPlayedPlayer)){
            throw new InvalidParameterException("player already made move");
        }

        String position = board[move.getxPosition()][move.getyPosition()];
        if (position != null) {
            throw new InvalidParameterException("position is already taken");
        }

        board[move.getxPosition()][move.getyPosition()] = move.getPlayer();
        lastPlayedPlayer = move.getPlayer();
        return board;
    }

}
