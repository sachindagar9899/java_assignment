package whapper;
import java.util.ArrayList;
import java.util.Collections;

public class employee_data {
    public static void main(String[] args) {
        int[] agesArray = {25, 45, 30, 22, 50, 28};

        // Convert int[] to ArrayList<Integer> using auto-boxing
        ArrayList<Integer> agesList = new ArrayList<>();
        for (int age : agesArray) {
            agesList.add(age);
        }

        // Find youngest and oldest ages
        int youngest = Collections.min(agesList);
        int oldest = Collections.max(agesList);

        System.out.println("Youngest employee age: " + youngest);
        System.out.println("Oldest employee age: " + oldest);
    }
}
 


