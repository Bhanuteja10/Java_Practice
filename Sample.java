import tools.*;

public class Sample {
    private int a;

    public static void main(String[] args) {

        Calc calc = new Calc();
        AdvCalc advCalc = new AdvCalc();

        System.out.println(calc.add(1, 2));
        System.out.println(Calc.div(14, 2));
        System.out.println(advCalc.power(3, 2));
        // System.out.println(calc.test);

    }
}