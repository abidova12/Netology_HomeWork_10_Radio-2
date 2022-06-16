package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio rad = new Radio();


    @Test
    public void test() {
        Radio rad = new Radio();
    }

    @Test
    public void testWithParameter() {
        Radio rad = new Radio(350);
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(350, rad.getMaxStation());
    }

    @Test
    void defaultStations() {
        Assertions.assertEquals(10, rad.getMaxStation());
    }

    @Test
    void limitStationMoreMax() {

        rad.setCurrentStation(rad.getMaxStation() + 1);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitStationLessMin() {

        rad.setCurrentStation(-2);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {

        rad.setCurrentStation(rad.getMinStation());

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationMoreMax() {

        rad.setCurrentStation(rad.getMaxStation());

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = rad.getMinStation();

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {

        rad.setCurrentStation(rad.getMaxStation());

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = rad.getMaxStation() - 1;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationLessMin() {

        rad.setCurrentStation(rad.getMaxStation() + 1);

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = rad.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    void limitVolume() {

        rad.setCurrentVolume(5);

        int actual = rad.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void limitVolumeLessNull() {

        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitVolumeMoreTen() {

        rad.setCurrentVolume(101);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void plusVolume() {

        rad.setCurrentVolume(9);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void plusVolumeMoreTen() {

        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void minusVolume() {

        rad.setCurrentVolume(10);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void minusVolumeLessNull() {

        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
