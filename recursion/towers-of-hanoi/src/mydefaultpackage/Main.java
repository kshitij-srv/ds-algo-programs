package mydefaultpackage;

public class Main {
    public static void main(String args[]) {
        towersOfHanoi(args.length > 0 ? Integer.parseInt(args[0]) : 3, "A", "B", "C");
    }

    static void towersOfHanoi(int noOfDiscs, String startPeg, String endPeg, String auxPeg) {
        if (noOfDiscs == 1) {
            System.out.println("Move disk " + 1 + " from peg " + startPeg + " to peg " + endPeg);
            return;
        }
        towersOfHanoi(noOfDiscs - 1, startPeg, auxPeg, endPeg);
        System.out.println("Move disk " + noOfDiscs + " from peg " + startPeg + " to peg " + endPeg);
        towersOfHanoi(noOfDiscs - 1, auxPeg, endPeg, startPeg);
    }
}
