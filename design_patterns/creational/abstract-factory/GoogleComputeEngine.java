public class GoogleComputeEngine implements Instance {

    public GoogleComputeEngine(Capacity capacity) {
        System.out.println("GoogleComputeEngine Instance created");
    }

    @Override
    public void start() {
        System.out.println("GoogleComputeEngine started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("GoogleComputeEngine storage" + storage);
    }

    @Override
    public void stop() {
        System.out.println("GoogleComputeEngine stopped");
    }
}
