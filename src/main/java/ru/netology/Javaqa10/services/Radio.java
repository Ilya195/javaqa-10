package ru.netology.Javaqa10.services;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        int zero = 0;
        for (int i = 0; i <= 9; i++) {
            if (currentRadioStation >= 0 && currentRadioStation < 9) {
                currentRadioStation = i + 1;
                if (currentRadioStation >= 9) {
                    currentRadioStation = i * zero;
                    return;
                }
            }
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (0 <= currentVolume && currentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
        if (currentVolume >= 10) {
           currentVolume = currentVolume - 1;
        }
    }
}