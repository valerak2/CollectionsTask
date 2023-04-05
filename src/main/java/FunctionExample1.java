import java.util.concurrent.TimeUnit;

public class FunctionExample1 extends SomeFunction {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isReady= true;
    }
}
