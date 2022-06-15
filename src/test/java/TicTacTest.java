import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TicTacTest {


    @Test
    void whenUserMove_ShouldChangeMatrix() {
        TickTack tickTack = new TickTack();
        String[][] board = tickTack.play("x", 1, 1);
        assertEquals(board[1][1], "x");
    }

    @Test
    void whenUserMoveToAlreadyTakenPosition_ShouldThrowException() {
        TickTack tickTack = new TickTack();
        tickTack.play("x", 1, 2);

        Assertions.assertThrows(InvalidParameterException.class,
                () -> tickTack.play("o", 1, 2), "position is already taken");
    }
}

// 1 2 3
// 4 5 6
// 7 8 9