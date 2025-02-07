
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilmTest {
    private Film film18 = new Film("Alien", Film.RATING_18 );
    private Film film15 = new Film("Aliens", Film.RATING_15 );
    private Film film12 = new Film("Spiderman", Film.RATING_12 );
    private Film filmPG = new Film("Coco", Film.RATING_PG );
    private Film filmU = new Film("Chitty Chitty Bang Bang", Film.RATING_U );



    @Test
    @DisplayName("Check is person old enough to see a 18 rated film if 20")
    void isAllowedToView_FilmIs18RatedViewerOldEnough_ReturnsTrue(){
        boolean result = film18.isAllowedToView(20);
        assertTrue(result);
    }
    @Test
    @DisplayName("Check is person is not old enough to see a 15 rated film if 17")
    void isAllowedToView_FilmIs18RatedViewerOldEnough_ReturnsFalse(){
        boolean result = film18.isAllowedToView(17);
        assertFalse(result);
    }
    @Test
    @DisplayName("Check is person is old enough to see a 15 rated film if 17")
    void isAllowedToView_FilmIs15RatedViewerOldEnough_ReturnsTrueOrFalse(){
        boolean result = film15.isAllowedToView(17);
        assertTrue(result);

    }
    @Test
    @DisplayName("Check is person is old enough to see a 15 rated film if 17")
    void isAllowedToView_FilmIs15RatedViewerOldEnough_ReturnsFalse(){
       boolean result2 = film15.isAllowedToView(14);
            assertFalse(result2);
    }
    @Test
    @DisplayName("Check is person is old enough to see a 12 rated film if 14")
    void isAllowedToView_FilmIs12RatedViewerOldEnough_ReturnsTrue(){
        boolean result = film12.isAllowedToView(14);
        assertTrue(result);
    }

    @Test
    @DisplayName("Check is person is old enough to see a 12 rated film if 11")
    void isAllowedToView_FilmIs12RatedViewerOldEnough_ReturnsFalse(){
        boolean result = film12.isAllowedToView(11);
        assertFalse(result);
    }

}
