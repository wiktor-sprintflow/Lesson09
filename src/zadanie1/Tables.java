package zadanie1;

import java.util.Random;

public class Tables {
    public static int[] invertTable(int[] table) {
        int[] invertedTable = table.clone();

        for (int i = 0; i < invertedTable.length / 2; i++) {
            int temp = invertedTable[i];
            invertedTable[i] = invertedTable[invertedTable.length - 1 - i];
            invertedTable[invertedTable.length - 1 - i] = temp;
        }
        return invertedTable;

        /* INNA METODA
        for(int i =0; i< array.lenght ;i++){
            reversed[i] = array[array.lenght-1-i]
            }
         */
    }

    public static int[] randomTable(int size, int upperLimit) {
        Random rand = new Random();
        int[] table = new int[size];

        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(upperLimit);
        }
        return table;
    }

    public static int checkArrayValues(int[] array, int number) {
        int counter = 0;
        for (int i : array) {
            if (i == number) {
                counter++;
            }
        }
        return counter;
    }
}