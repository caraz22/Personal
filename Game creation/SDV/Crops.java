package SDV;

import java.util.ArrayList;

public class Crops extends Season {

    String seasonCropName;
    int seasonCropPrice;
    
    public Crops(String seasonCropName, int seasonCropPrice) {
        super(seasonCropName, seasonCropPrice);
    }

    public Crops(String seasonCropName) {
        super(seasonCropName);
    }

    public Crops() {
        super();
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

    public int getBuyingPrice(ArrayList<Season> o) {
        int buyingPrice = 0;
        for (Season crop : o) {
            if (this.getSeasonCropName().equalsIgnoreCase(crop.getSeasonCropName())) {
                buyingPrice = crop.getSeasonCropPrice();
            }
        }

        return buyingPrice;
    }    

    @Override
    public String toString() {
        return seasonCropName;
    }

}