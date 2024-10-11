import java.util.ArrayList;

public class Dinner {

    public static void main(String[] args) {
        ArrayList<Object> meals = new ArrayList<Object>();      
        CookingNight meal1 = new CookingNight("Alfredo");  
        meals.add(meal1);
        DateNight meal2 = new DateNight("Olive Garden");
        meals.add(meal2);

        for (int i = 0; i < meals.size(); i++) {
            System.out.println(meals.get(i));
        }
    }



    Dinner() {

    }
}