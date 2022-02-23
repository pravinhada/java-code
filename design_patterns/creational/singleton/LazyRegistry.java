public class LazyRegistry {

    private static volatile LazyRegistry instance;

    private LazyRegistry(){}

    public static LazyRegistry getInstance() {
        if (instance == null) {
            synchronized (LazyRegistry.class) {
                if (instance == null) {
                    instance = new LazyRegistry();
                }
            }
        }
        return instance;
    }
}
