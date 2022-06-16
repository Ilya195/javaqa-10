package ru.netology.Javaqa10.services;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (currentRadioStation >= 0 && currentRadioStation < 10) {
            currentRadioStation = newCurrentRadioStation + 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (0 <= currentVolume && currentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
    }
}
