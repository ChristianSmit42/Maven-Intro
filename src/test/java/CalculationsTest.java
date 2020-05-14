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
    @DisplayName("Bei 30 Personen sollte Ergebnis sein: OK METHODE: coronaCount()")
    public void coronaShouldntSpreadwith30Ppl(){
        // Given
        int a = 30;

        // WHEN
        String result = Calculations.coronaCount(a);

        // THEN
        assertEquals("OK", result);
    }

    @Test
    @DisplayName("Bei 32 Personen sollte Ergebnis sein: LIMIT ÜBERSCHRITTEN! METHODE: coronaCount()")
    public void coronaMightSpreadwith32Ppl(){
        // Given
        int a = 32;

        // WHEN
        String result = Calculations.coronaCount(a);

        // THEN
        assertEquals("LIMIT ÜBERSCHRITTEN!", result);
    }

    @Test
    @DisplayName("Bei Alarmstufe Rot sollten keine Personen erlaubt sein METHODE: countByAlert()")
    public void personen0BeiAlarmRot(){
        // GIVEN
        String a = "rot";

        // WHEN
        int result = Calculations.countByAlert(a);

        // THEN
        assertEquals(0,result);
    }

    @Test
    @DisplayName("Bei Alarmstufe Gelb sollten 30 Personen erlaubt sein METHODE: countByAlert()")
    public void personen30BeiAlarmGelb(){
        // GIVEN
        String a = "gelb";

        // WHEN
        int result = Calculations.countByAlert(a);

        // THEN
        assertEquals(30,result);
    }

    @Test
    @DisplayName("Bei Alarmstufe Grün sollten 60 Personen erlaubt sein METHODE: countByAlert()")
    public void personen60BeiAlarmGruen(){
        // GIVEN
        String a = "gruen";

        // WHEN
        int result = Calculations.countByAlert(a);

        // THEN
        assertEquals(60,result);
    }

    @Test
    @DisplayName("Die Fakultät von 8 sollte 40320 sein METHODE: countByAlert()")
    public void fakultatVon8Soll40320Sein(){
        // GIVEN
        int fakultat = 40320;

        // WHEN
        int resultat = Calculations.faculty(8);

        // THEN
        assertEquals(fakultat, resultat);
    }

    @Test
    @DisplayName("Die Fakultät von 0 sollte 1 sein METHODE: countByAlert()")
    public void fakultatVon0Soll1Sein(){
        // GIVEN
        int fakultat = 1;

        // WHEN
        int resultat = Calculations.faculty(0);

        // THEN
        assertEquals(fakultat, resultat);
    }

    @Test
    @DisplayName("Die Fakultät von 1 sollte 1 sein METHODE: countByAlert()")
    public void fakultatVon1Soll1Sein(){
        // GIVEN
        int fakultat = 1;

        // WHEN
        int resultat = Calculations.faculty(1);

        // THEN
        assertEquals(fakultat, resultat);
    }
}