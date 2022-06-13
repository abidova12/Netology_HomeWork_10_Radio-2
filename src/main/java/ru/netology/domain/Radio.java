package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        }
        currentStation = 0;
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        currentStation = 9;
    }
}