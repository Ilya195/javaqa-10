package ru.netology.Javaqa10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void showCurrentRadioStation() {
        Radio service = new Radio();

        service.setCurrentRadioStation(9);

        int expected = 0;
        int actual = service.getcurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void showCurrentVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(10);

        int expected = 10;
        int actual = service.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
