public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int maxVolume;


    public Radio() {
        maxStation = 9;
        maxVolume = 100;

    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;

    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
            return;
        }
        currentStation = maxStation;

    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }

        this.currentStation = currentStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
            return;
        }
        currentVolume = maxVolume;

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
            return;
        }
        currentVolume = 0;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}


