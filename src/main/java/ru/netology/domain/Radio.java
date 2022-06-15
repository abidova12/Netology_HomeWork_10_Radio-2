package ru.netology.domain;

public class Radio {

    private int maxVolume = 100;
    private int minVolume;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation;
    private int currentStation;


    public Radio(int maxStation, int minStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
    }

    public Radio() {
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        } else if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void increaseStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
            return;
        }
        currentStation = minStation;
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
            return;
        }
        currentStation = maxStation;
    }
}