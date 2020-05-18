import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    @DisplayName("New Student should bare Name usw as given to the Constructor")
    public void newStudentHasCorrectData() {
        // GIVEN
        String name = "Paul";
        String studienrichtung = "Bio";
        int semester = 2;

        // WHEN
        Students teststudent = new Students(name, studienrichtung, semester);

        // THEN
        assertEquals("Paul", teststudent.getName());
        assertEquals("Bio", teststudent.getStudienrichtung());
        assertEquals(2, teststudent.getSemester());
    }
}