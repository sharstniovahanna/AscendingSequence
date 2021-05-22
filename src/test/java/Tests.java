import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    @Test
    public void testAscendingStringSequenceHappyPath() {
        int startNumber = 1;
        int endNumber = 5;
        String expectedResult = "1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber,endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingStringSequenceHappyPathZero() {
        int startNumber = 0;
        int endNumber = 5;
        String expectedResult = "0, 1, 2, 3, 4, 5";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringSequenceHappyPathZeroToTen() {
        int startNumber = 0;
        int endNumber = 10;
        String expectedResult = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringSequenceHappyPathNegativeFiveToTen() {
        int startNumber = -5;
        int endNumber = 10;
        String expectedResult = "-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringSequenceNegative() {
        int startNumber = 0;
        int endNumber = -9;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingStringSequenceNegativeStartNumberIsEqualEndNumber() {
        int startNumber = -9;
        int endNumber = -9;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingStringSequenceNegativeBigNumbers() {
        int startNumber = (- 2147483648 - 1);
        int endNumber = 2147483647 + 1;
        String expectedResult = "Error";

        AscendingSequence ascendingSequence = new AscendingSequence();
        String actualResult = ascendingSequence.buildAscendingString(startNumber, endNumber);

        Assert.assertEquals(expectedResult, actualResult);
    }

}
