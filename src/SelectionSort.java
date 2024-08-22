import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        ArrayList<Integer> randomArray = new ArrayList<>(Arrays.asList(88, 63,
                84, 76, 16, 90, 87, 55, 37, 77, 65, 45, 66, 95, 14, 100, 34, 32,
                6, 96, 52, 36, 57, 59, 93, 10, 83, 23, 35, 70, 21, 81, 98, 89,
                82, 74, 58, 86, 26, 18, 38, 91, 13, 2, 60, 61, 47, 25, 8, 71));

        System.out.println(searchMinor(randomArray));

        System.out.println(randomArray);
        System.out.println("-------------------------------------------------" +
                "-- ---------------------------------------------------------" +
                "------ -----------------------------------------------------" +
                "------------------------------------------------------------" +
                "---_ -------------------------------------------------------");

        System.out.println(selectionSort(randomArray));


    }
    private static int searchMinor(ArrayList<Integer> randomArray){
        int minor = randomArray.get(0);
        int minorIndex = 0;

        for (int i = 0; i < randomArray.size(); i++) {
            if (randomArray.get(i) < minor) {
                minor = randomArray.get(i);
                minorIndex = i;
            }
        }
        return  minorIndex;
    }

    private static ArrayList<Integer> selectionSort(ArrayList<Integer> randomArray){
        ArrayList<Integer> orderedArray = new ArrayList();
        ArrayList<Integer> copyArray  = new ArrayList(randomArray);
        while (!copyArray.isEmpty()){
            int minor = searchMinor(copyArray);
            orderedArray.add(copyArray.remove(minor));
        }
        return  orderedArray;
    }

}