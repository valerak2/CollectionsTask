import java.util.concurrent.TimeUnit;

/**
 * Структура данных - LinkedBlockingQueue (в классе ManagementSystem)
 * Т.к нам нужно выводить результаты задачи в порядке их поступления,
 * т.е в порядке очереди,
 * и еще нужна потокобезопасность.
 *
 * Операция получения результата, если задача выполнена, О(1),
 * если задача не выполнена, то ждем какое-то константное время
 * и снова обращаемся за результатом и в итоге опять О(1)*/
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ManagementSystem calculationManagementSystem = new ManagementSystem();
        FunctionExample1 function1 = new FunctionExample1();
        FunctionExample2 function2 = new FunctionExample2();
        calculationManagementSystem.addFunction(function1);
        calculationManagementSystem.addFunction(function2);

        calculationManagementSystem.getResult();

        TimeUnit.SECONDS.sleep(4);
        calculationManagementSystem.getResult();
        calculationManagementSystem.getResult();

    }
}
