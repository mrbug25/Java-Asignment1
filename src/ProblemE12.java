public class ProblemE12 {
    private int result;

    public ProblemE12(){
        result = 0;
    }

    public int seriesSummation(int highestNumber){
        for(int loopCount=1;loopCount<=highestNumber;loopCount++){
            result = result + loopCount;
        }
        return result;
    }
}
