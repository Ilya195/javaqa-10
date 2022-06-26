package ru.netology.Javaqa10.services;

public class Radio {
    protected int currentRadioStation;
    protected int currentVolume;
    protected int maxStation = 9;

    public Radio(){
        maxStation = 9;
    }

    public Radio(int stationscount){
    maxStation = stationscount - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        } else if (newCurrentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadio() {
        if (currentRadioStation < maxStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadio() {
        if (0 < currentRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolumePlus() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
    }

    public void setCurrentVolumeMinus() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}