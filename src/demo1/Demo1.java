package demo1;

public class Demo1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printArray(array);
     }

     static void  printArray(int[] array){
         for (int i : array) {
             System.out.println(i);
         }
     }
}
