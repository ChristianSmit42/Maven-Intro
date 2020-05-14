import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
    @Test
    public void fivePlus3ShouldBe8(){
        // Given
        int first = 3;
        int second = 5;

        // WHEN
        int result = Calculations.add(first, second);

        // Then
        assertEquals(8, result);
    }
}