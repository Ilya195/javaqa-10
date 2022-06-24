package ru.netology.Javaqa10.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {



    Radio service = new Radio();

    @Test
    public void showCurrentRadioStationNext9() {
        Radio service = new Radio();
        service.setCurrentRadioStation(8);
        service.next();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentRadioStationNext() {
        Radio service = new Radio();
        service.setCurrentRadioStation(9);
        service.next();
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentRadioStationMax() {
        Radio service = new Radio();
        service.setCurrentRadioStation(11);
        service.next();
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentRadioStationPrev1() {
        Radio service = new Radio();
        service.setCurrentRadioStation(1);
        service.down();
        int expected = 0;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentRadioStationPrev() {
        Radio service = new Radio();
        service.setCurrentRadioStation(0);
        service.down();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentRadioStationPrevZero() {
        Radio service = new Radio();
        service.setCurrentRadioStation(- 1);
        service.down();
        int expected = 9;
        int actual = service.getcurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentVolumeMax() {

        service.setCurrentVolume(100);

        int expected = 100;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentVolumeMin() {

        service.setCurrentVolume(0);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentVolumePlus() {

        service.setCurrentVolume(99);
        service.maxVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void showCurrentVolumeMinus() {

        service.setCurrentVolume(1);
        service.minVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }
}
