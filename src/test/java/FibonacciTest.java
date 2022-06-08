import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
    0 -> 0
    1 -> 1
    2 -> 1
    3 -> 2
    4 -> 3
    5 -> 5
 */


public class FibonacciTest {

    @Test
    void respondWithZeroWhenIndexIsZero() {
        Assertions.assertEquals(0, new Fibonacci().get(0));
    }

    @Test
    void respondWithOneWhenIndexIsOne() {
        Assertions.assertEquals(1, new Fibonacci().get(1));
    }

    @Test
    void respondWithOneWhenIndexIsTwo() {
        Assertions.assertEquals(1, new Fibonacci().get(2));
    }

    @Test
    void respondWithTwoWhenIndexIsThree() {
        Assertions.assertEquals(2, new Fibonacci().get(3));
    }

    @Test
    void respondWithThreeWhenIndexIsFour() {
        Assertions.assertEquals(3, new Fibonacci().get(4));
    }

}
