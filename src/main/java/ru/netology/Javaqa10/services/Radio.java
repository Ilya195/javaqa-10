package ru.netology.Javaqa10.services;

public class Radio {
    private int currentRadioStation;
    public int currentVolume;

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }


    public void setcurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        } else if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void NextRadio() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;
    }

    public void PrevRadio() {
       if (0 < currentRadioStation) {
           currentRadioStation = currentRadioStation - 1;
       } else currentRadioStation = 9;
    }


    public void currentVolumePlus() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void currentVolumeMinus() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}