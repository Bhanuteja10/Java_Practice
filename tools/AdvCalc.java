package tools;

public class AdvCalc extends Calc {

    public int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int log(int a, int b) {
        return (int) (Math.log(a) / Math.log(b));
    }

    public int sqrt(int a) {
        return (int) Math.sqrt(a);
    }
}