/* prints the product of the first ten positive integers, 1*2*.…*10. (Use * to indicate
multiplication in Java.) */

public class E13Runner  {
    public static void main(String[] args) {

        ProblemE13 seriesMultiplication = new ProblemE13();
        int result = seriesMultiplication.seriesMultiplication(10);

        System.out.println(result);
    }
}
