import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class ManagementSystem {
    LinkedBlockingQueue<SomeFunction> linkedBlockingQueue = new LinkedBlockingQueue<>();
    private final ThreadPoolExecutor threadPoolExecutor =
            (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

    public void addFunction(SomeFunction function) {
        threadPoolExecutor.submit(function);
        linkedBlockingQueue.add(function);
    }

    public void getResult() {
        assert linkedBlockingQueue.peek() != null;
        if (linkedBlockingQueue.peek().isReady) System.out.println("Задача выполнена");
        else System.out.println("Задача еще не готова");

    }

}
