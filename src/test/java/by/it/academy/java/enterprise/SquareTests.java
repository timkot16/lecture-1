package by.it.academy.java.enterprise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTests {
    private Square square = new Square();

    @Test
    public void positiveSquare() {

        assertEquals(8, square.caclculateSquare(2));
        assertEquals(-27, square.caclculateSquare(-3));
    }

    @Test
    public void nullCase() {
        assertEquals(0, square.caclculateSquare(null));
    }
}
