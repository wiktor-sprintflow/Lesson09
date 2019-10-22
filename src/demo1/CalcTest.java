package demo1;

public class CalcTest {
    public static void main(String[] args) {
        double a = 5;
        //statycznie
        double squreArea = Calc.squareArea(a);
        System.out.println(squreArea);

// obiektowo:
//        Calc calc = new Calc();
//        double squareArea = calc.squareArea(a);
    }
}
