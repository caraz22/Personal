package SDV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FarmingExpensesSim {
    
    public static ArrayList<Season> readSeason(String fileName) throws FileNotFoundException {
        Scanner scanSeason = new Scanner(new File(fileName));
        ArrayList<Season> seasonCrops = new ArrayList<>();

        while (scanSeason.hasNextLine()) {
            String getDetails = scanSeason.nextLine();
            String[] cropDetails = getDetails.split(", ");
            String cropName = cropDetails[0];
            int cropPrice = Integer.parseInt(cropDetails[1]);

            Season seasonCrop = new Season(cropName, cropPrice);
            seasonCrop.setSeasonCropName(cropName);
            seasonCrop.setSeasonCropPrice(cropPrice);

            seasonCrops.add(seasonCrop);
        }

        scanSeason.close();
        return seasonCrops;
    }

    public static void listCrops(ArrayList<Season> season, String chosenSeason) throws InterruptedException {
        System.out.println("Here are the purchasable crops for " +  chosenSeason + ": ");
        for (int i = 0; i < season.size(); i++) {
            Thread.sleep(50);
            System.out.println(season.get(i));
        }
    }

    public static String getTotalCost(ArrayList<Integer> cost, ArrayList<Integer> numBought) {
        int total = 0;
        for (int i = 0; i < cost.size(); i++) {
            int multiply = cost.get(i) * numBought.get(i);
            total += multiply;
        }

        char comma = ',';
        String temp = Integer.toString(total);
        String newTemp = "";
        
        if (total > 999 && total < 10000) {
            newTemp = temp.substring(0, 1) + comma + temp.substring(1);
        } else if (total > 9999 && total < 100000) {
            newTemp = temp.substring(0, 2) + comma + temp.substring(2);
        } else if (total > 99999 && total < 1000000) {
            newTemp = temp.substring(0, 3) + comma + temp.substring(3);
        } else if (total > 999999) {
            newTemp = temp.substring(0, 4) + comma + temp.substring(4);
        }

        return newTemp;
    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        
        ArrayList<Season> spring = readSeason("src/SDV/txt files/Spring crops.txt");
        ArrayList<Season> summer = readSeason("src/SDV/txt files/Summer crops.txt");
        ArrayList<Season> fall = readSeason("src/SDV/txt files/Fall crops.txt");
        ArrayList<Season> winter = readSeason("src/SDV/txt files/Oasis crops.txt");

        System.out.println("Welcome to the Stardew Valley farming expenses simulator!");
        System.out.println();
        System.out.print("What season are you in? ");
        Scanner in = new Scanner(System.in);
        String season = in.nextLine();
        System.out.println();

        ArrayList<Season> chosenSeason = new ArrayList<>();

        while (true) {
            if (season.equalsIgnoreCase("spring")) {
                System.out.println();
                chosenSeason.addAll(spring);
                listCrops(spring, season);
                break;
            } else if (season.equalsIgnoreCase("summer")) {
                System.out.println();
                chosenSeason.addAll(summer);
                listCrops(summer, season);
                break;
            } else if (season.equalsIgnoreCase("fall")) {
                System.out.println();
                chosenSeason.addAll(fall);
                listCrops(fall, season);
                break;
            } else if (season.equalsIgnoreCase("winter")) {
                System.out.println();
                chosenSeason.addAll(winter);
                System.out.println("Unless you have Pierre's missing stocklist, the only crops you can buy are from Sandy at the Oasis, and they can only be planted in the Greenhouse (or at your island farm, if unlocked). \nHere are the purchasable crops from Sandy: ");
                for (int i = 0; i < winter.size(); i++) {
                    Thread.sleep(50);
                    System.out.println(winter.get(i));
                }
                break;
            } else {
                System.out.print("Please enter a valid season (spring, summer, fall, winter): ");
                season = in.nextLine();
            }
        }

        Thread.sleep(50);
        System.out.println();
        System.out.print("Which crops do you plan on buying? Please separate each crop with a comma and a space (', '). This is not case sensitive. ");
        String buying = in.nextLine();

        System.out.print("Are you sure? Please make sure your spelling matches the list (y/n). ");
        char yesNo = in.next().charAt(0);
        
        while (yesNo != 'y') {
            if (yesNo == 'y') {
            } else if (yesNo == 'n') {
                System.out.print("Okay, then which crops do you plan on actually buying? ");
                in.nextLine();                
                buying = in.nextLine();
                System.out.print("Are you sure? Please make sure your spelling matches the list (y/n). ");
                yesNo = in.next().charAt(0);
            } else {
                System.out.print("This is a yes or no question, please respond with either 'y' or 'n'. ");
                yesNo = in.next().charAt(0);
            }
        }

        System.out.println();

        String[] cropsNames = buying.split(", ");
        
        ArrayList<Crops> crops = new ArrayList<>();
        String cropName = "";
        int cropCost = 0;
        int numBuying = 0;

        ArrayList<Integer> costs = new ArrayList<>();
        ArrayList<Integer> bought = new ArrayList<>();

        for (int i = 0; i < cropsNames.length; i++) {
            String name = cropsNames[i];
            Crops crop = new Crops(name);
            crops.add(crop);
            crop.setSeasonCropName(name);

            cropName = crop.getSeasonCropName();
            cropCost = crop.getBuyingPrice(chosenSeason);   
            costs.add(cropCost);  

            System.out.print("How many " + cropName + " seeds would you like to buy? They each cost " + cropCost + "g. ");
            numBuying = in.nextInt();
            bought.add(numBuying);
        }

        System.out.println();
        String total = getTotalCost(costs, bought);
        System.out.println("Your total is " + total + "g. Happy farming!");


        in.close();
    }
}
