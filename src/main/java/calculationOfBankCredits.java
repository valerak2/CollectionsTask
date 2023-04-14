public class calculationOfBankCredits implements SomeFunction {
    private final double requestedAmount;
    private final double rateOfInterest;
    private double result;

    public calculationOfBankCredits(double requestedAmount, double rateOfInterest) {
        this.requestedAmount = requestedAmount;
        this.rateOfInterest = rateOfInterest;
    }


    @Override
    public Double getResult() {
        return result;
    }

    @Override
    public void run() {
        result = requestedAmount + ((requestedAmount * rateOfInterest));
    }
}

