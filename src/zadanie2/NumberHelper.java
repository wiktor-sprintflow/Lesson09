package zadanie2;

public class NumberHelper {
    public static int reverseNumber(int number) {

        double reverseNumber = 0;
        int modulo;
        int numberOfDigits = getNumberOfDigits(number);
        
        for (int i = 0; i < numberOfDigits; i++) {
            modulo = number % 10;
            reverseNumber += modulo * Math.pow(10, numberOfDigits - 1 - i);
            number /= 10;
        }
        return (int) reverseNumber;

    }

    public static int getNumberOfDigits(int number) {
        int i = 0;
        do {
            number /= 10;
            i++;
        } while (number != 0);
        return i;
    }
}
