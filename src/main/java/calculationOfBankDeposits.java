public class calculationOfBankDeposits implements SomeFunction {
    private final double depositAmount;
    private final int termOfPlacement;
    private final double rateOfInterest;
    private double result;

    public calculationOfBankDeposits(double depositAmount, int termOfPlacement, double rateOfInterest) {
        this.depositAmount = depositAmount;
        this.termOfPlacement = termOfPlacement;
        this.rateOfInterest = rateOfInterest;
    }


    @Override
    public Double getResult() {
        return result;
    }

    @Override
    public void run() {
        result = depositAmount + ((depositAmount * rateOfInterest) * termOfPlacement);
    }
}
