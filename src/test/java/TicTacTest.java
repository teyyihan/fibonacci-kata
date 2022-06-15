import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicTacTest {
    @Test
    void whenUserMove_ShouldChangeMatrix() {
        TicTac tickTack = new TicTac();
        tickTack.play(new Move("x", 1, 1));
        String[][] board = tickTack.play(new Move("o", 1, 2));
        assertEquals(board[1][1], "x");
        assertEquals(board[1][2], "o");
    }

    @Test
    void whenUserMoveToAlreadyTakenPosition_ShouldThrowException() {
        TicTac tickTack = new TicTac();
        tickTack.play(new Move("x", 1, 2));

        Assertions.assertThrows(InvalidParameterException.class,
                () -> tickTack.play(new Move("o", 1, 2)), "position is already taken");
    }

    @Test
    void whenPlayerPlaysTwice_ShouldThrowException() {
        TicTac tickTack = new TicTac();
        tickTack.play(new Move("x", 1, 2));

        Assertions.assertThrows(InvalidParameterException.class,
                () -> tickTack.play(new Move("x", 1, 0)), "player already made move");
    }

    @Test
    void whenPlayerGivesInvalidPosition_ShouldThrowException() {
        TicTac tickTack = new TicTac();

        Assertions.assertThrows(InvalidParameterException.class,
                () -> tickTack.play(new Move("x", -1, 4)), "invalid position");
    }

    /*@Test
    void whenBoardIsFull_ShouldShowResult() {
        TicTac tickTack = new TicTac();
        tickTack.play(new Move("x", 0, 0));
        tickTack.play(new Move("o", 0, 1));
        tickTack.play(new Move("x", 0, 2));
        tickTack.play(new Move("o", 1, 0));
        tickTack.play(new Move("o", 1, 1));
        tickTack.play(new Move("x", 1, 2));
        tickTack.play(new Move("o", 2, 0));
        tickTack.play(new Move("o", 2, 1));
        tickTack.play(new Move("x", 2, 2));

        Assertions.assertThrows(InvalidParameterException.class,
                () -> tickTack.play(new Move("o", 1, 2)), "position is already taken");
    }*/

}

// 1 2 3
// 4 5 6
// 7 8 9