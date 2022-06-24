package ru.netology.Javaqa10.services;

public class Radio {
    protected int currentRadioStation;
    protected int currentVolume;
    protected int maxStation;

    public Radio(int stationscount){
    }
    public Radio(){
        maxStation = 9;
    }

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStationNext(int newCurrentRadioStation) {
        if ( currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
            }
    }

    public void setCurrentRadioStationDown(int newCurrentRadioStation) {
        if ( currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
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