package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio rad = new Radio();

    @Test
    void createdStations() {
        Radio rad = new Radio(25, 0);
        Assertions.assertEquals(25, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getMinStation());
    }

    @Test
    void defaultStations() {
        Assertions.assertEquals(9, rad.getMaxStation());
    }

    @Test
    void limitStation() {

        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitStationMoreNine() {

        rad.setCurrentStation(10);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void limitStationLessNull() {

        rad.setCurrentStation(-2);

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void nextStation() {

        rad.setCurrentStation(6);

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void nextStationPastNine() {

        rad.setCurrentStation(9);

        rad.increaseStation();

        int actual = rad.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void prevStation() {

        rad.setCurrentStation(5);

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void prevStationPastNull() {

        rad.setCurrentStation(0);

        rad.decreaseStation();

        int actual = rad.getCurrentStation();
        int expected = 9;

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
