package SDV;

import java.util.ArrayList;

public class Season {
    
    private String seasonName;
    private String seasonCropName;
    private int seasonCropPrice;
    private ArrayList<Season> chosenSeason;

    public Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public Season() {

    }

    public Season(ArrayList<Season> chosenSeason) {
        this.chosenSeason = chosenSeason;
    }

    public Season(String seasonCropName, int seasonCropPrice) {
        this.seasonCropName = seasonCropName;
        this.seasonCropPrice = seasonCropPrice;
    }

    public ArrayList<Season> getChosenSeason() {
        return chosenSeason;
    }

    public void setChosenSeason(ArrayList<Season> chosenSeason) {
        this.chosenSeason = chosenSeason;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonCropName() {
        return seasonCropName;
    }

    public void setSeasonCropName(String seasonCropName) {
        this.seasonCropName = seasonCropName;
    }

    public int getSeasonCropPrice() {
        return seasonCropPrice;
    }

    public void setSeasonCropPrice(int seasonCropPrice) {
        this.seasonCropPrice = seasonCropPrice;
    }

    @Override
    public String toString() {
        return seasonCropName + ": " + seasonCropPrice + "g";
    }
}
