import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {
    @Test
    @DisplayName("5 + 3 sollte 8 ergeben")
    public void fivePlus3ShouldBe8(){
        // Given
        int first = 3;
        int second = 5;

        // WHEN
        int result = Calculations.add(first, second);

        // Then
        assertEquals(8, result);
    }

    @Test
    @DisplayName("Bei 30 Personen sollte Ergebnis sein: OK")
    public void coronaShouldntSpreadwith30Ppl(){
        // Given
        int a = 30;

        // WHEN
        String result = Calculations.coronaCount(a);

        // THEN
        assertEquals("OK", result);
    }

    @Test
    @DisplayName("Bei 32 Personen sollte Ergebnis sein: LIMIT ÜBERSCHRITTEN! ")
    public void coronaMightSpreadwith32Ppl(){
        // Given
        int a = 32;

        // WHEN
        String result = Calculations.coronaCount(a);

        // THEN
        assertEquals("LIMIT ÜBERSCHRITTEN!", result);
    }
}