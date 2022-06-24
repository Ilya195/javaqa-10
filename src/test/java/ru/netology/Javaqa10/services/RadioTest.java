package ru.netology.Javaqa10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    Radio service = new Radio();

    @Test
    public void showCurrentRadioStation() {

        service.setcurrentRadioStation(3);
        int expected = 3;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationEight() {


        service.setcurrentRadioStation(8);
        service.nextRadio();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNine() {

        service.setcurrentRadioStation(9);
        service.nextRadio();
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showMaxCurrentRadioStation() {


        service.setcurrentRadioStation(12);
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void showMinCurrentRadioStation() {

        service.setcurrentRadioStation(- 2);
        service.prevRadio();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation0() {

        service.setcurrentRadioStation(0);
        service.prevRadio();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {

        service.setcurrentRadioStation(9);
        service.prevRadio();
        int expected = 8;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumePlus8() {

        service.currentVolume = 8;
        service.setCurrentVolumePlus();
        int expected = 9;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumePlus9() {

        service.currentVolume = 9;
        service.setCurrentVolumePlus();
        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumePlusMax() {

        service.currentVolume = 10;
        service.setCurrentVolumePlus();
        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinus9() {

        service.currentVolume = 10;
        service.setCurrentVolumeMinus();
        int expected = 9;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinus8() {

        service.currentVolume = 9;
        service.setCurrentVolumeMinus();
        int expected = 8;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinusMin2() {

        service.currentVolume = 2;
        service.setCurrentVolumeMinus();
        int expected = 1;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinusMinOne() {

        service.currentVolume = 1;
        service.setCurrentVolumeMinus();
        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeMinusMin() {

        service.currentVolume = 0;
        service.setCurrentVolumeMinus();
        int expected = 0;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


