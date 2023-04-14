
/**
 * Структура данных - LinkedBlockingQueue (в классе ManagementSystem)
 * Т.к нам нужно выводить результаты задачи в порядке их поступления,
 * т.е в порядке очереди,
 * и еще нужна потокобезопасность.
 * <p>
 * Реализация интерфейса Queue обеспечивает получения первого элемента за O(1)

 */
public class Main {

    public static void main(String[] args) {
        ManagementSystem calculationManagementSystem = new ManagementSystem();

        double depositAmount = 100;
        int termOfPlacement = 12;
        double rateOfInterest = 0.12;
        calculationOfBankDeposits function1 =
                new calculationOfBankDeposits(depositAmount, termOfPlacement, rateOfInterest);

        double requestedAmount = 100000;
        rateOfInterest = 0.95;
        calculationOfBankCredits function2 = new calculationOfBankCredits(requestedAmount, rateOfInterest);

        calculationManagementSystem.addFunction(function1);
        calculationManagementSystem.addFunction(function2);

        calculationManagementSystem.printResultOnTask();
        calculationManagementSystem.printResultOnTask();


    }
}
