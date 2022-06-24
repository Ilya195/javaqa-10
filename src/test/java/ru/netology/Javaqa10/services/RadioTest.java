package ru.netology.Javaqa10.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio service = new Radio();



    @Test
    public void showCurrentRadioStation() {
        Radio service = new Radio();
        service.setcurrentRadioStation(3);
        int expected = 3;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentRadioStationTest() {
        Radio service = new Radio(34);

        service.setcurrentRadioStation(22);

        int actual = service.getcurrentRadioStation();

        assertEquals(22 , actual);
    }

    @Test
    public void shouldNextRadioStationEight() {
        Radio service = new Radio();
        service.setcurrentRadioStation(8);
        service.nextRadio();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNine() {
        Radio service = new Radio();
        service.setcurrentRadioStation(9);
        service.nextRadio();
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showMaxCurrentRadioStation() {
        Radio service = new Radio();
        service.setcurrentRadioStation(12);
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }


    @Test
    public void showMinCurrentRadioStation() {
        Radio service = new Radio();
        service.setcurrentRadioStation(- 2);
        service.prevRadio();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation0() {
        Radio service = new Radio();
        service.setcurrentRadioStation(0);
        service.prevRadio();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio service = new Radio();
        service.setcurrentRadioStation(9);
        service.prevRadio();
        int expected = 8;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumePlus8() {

        service.currentVolume = 8;
        service.setCurrentVolumePlus();
        int expected = 9;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumePlus9() {

        service.currentVolume = 9;
        service.setCurrentVolumePlus();
        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumePlusMax() {

        service.currentVolume = 10;
        service.setCurrentVolumePlus();
        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinus9() {

        service.currentVolume = 10;
        service.setCurrentVolumeMinus();
        int expected = 9;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinus8() {

        service.currentVolume = 9;
        service.setCurrentVolumeMinus();
        int expected = 8;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinusMin2() {

        service.currentVolume = 2;
        service.setCurrentVolumeMinus();
        int expected = 1;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinusMinOne() {

        service.currentVolume = 1;
        service.setCurrentVolumeMinus();
        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinusMin() {

        service.currentVolume = 0;
        service.setCurrentVolumeMinus();
        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }
}



