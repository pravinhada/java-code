public class LazyInitializationHolder {
    private LazyInitializationHolder() {
        System.out.println("Get called only once");
    }

    public static LazyInitializationHolder getInstance() {
        return RegistryHolder.instance;
    }

    private static class RegistryHolder {
        static LazyInitializationHolder instance = new LazyInitializationHolder();
    }
}
