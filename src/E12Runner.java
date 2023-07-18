//prints the sum of the first ten positive integers, 1 + 2 + … + 10.

public class E12Runner {
    public static void main(String[] args) {

        ProblemE12 seriesSummation = new ProblemE12();

        int result = seriesSummation.seriesSummation(10);

        System.out.println(result);
        
    }
}
