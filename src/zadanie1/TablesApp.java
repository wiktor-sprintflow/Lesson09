package zadanie1;

import java.util.Arrays;

public class TablesApp {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        String invertedArray = Arrays.toString(Tables.invertTable(array));
        System.out.println(invertedArray);

        String randomTable = Arrays.toString(Tables.randomTable(5,100));
        System.out.println(randomTable);

        int[] array2 = {1,2,3,4,3,6,3,8,3};
        System.out.println("Liczba występuje w tablicy " + Tables.checkArrayValues(array2,3) + " razy");


    }

}
