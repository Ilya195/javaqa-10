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

    public int getcurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }


    public void next() {
        if ( currentRadioStation < maxStation) {
            currentRadioStation  ++;
        } else currentRadioStation = 0;
    }

    public void down() {
        if ( currentRadioStation > 0) {
            currentRadioStation --;
        } else currentRadioStation = 9; {

        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void maxVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        }
    }

    public void minVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100 ) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}