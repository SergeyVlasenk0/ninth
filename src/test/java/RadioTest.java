import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testNextAfterLast() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrevBeforeFirst() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testUncStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testUncStation2() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDecVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testVol() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDecrVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}
