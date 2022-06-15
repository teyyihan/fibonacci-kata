import java.security.InvalidParameterException;

public class Move {
    private String player;
    private int xPosition;
    private int yPosition;

    public Move(String player, int xPosition, int yPosition) {
        if((xPosition > 2 || xPosition <0) || (yPosition > 2 || yPosition < 0) ){
            throw new InvalidParameterException("invalid position");
        }
        this.player = player;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public String getPlayer() {
        return player;
    }
}
