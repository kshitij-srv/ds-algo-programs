package mydefaultpackage;

public class Main {
    public static void main(String args[]) {
        System.out.println(factorial(args.length > 0 ? Integer.parseInt(args[0]) : 0));
    }

    static double factorial(float number) {
        if (number == 0) {
            return 1;
        }
        return (number * factorial(number - 1));
    }
}
