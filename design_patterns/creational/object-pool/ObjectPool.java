import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {

    // pre cache objects
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        this.availablePool = new LinkedBlockingQueue<>();
        for (int i = 0; i < count; i++) {
            this.availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return this.availablePool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            this.availablePool.put(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
