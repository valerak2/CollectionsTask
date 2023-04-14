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

    public void printResultOnTask() {
        assert linkedBlockingQueue.peek() != null;
        System.out.println(linkedBlockingQueue.poll().getResult());

    }

}
