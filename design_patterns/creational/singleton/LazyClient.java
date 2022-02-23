public class LazyClient {
    public static void main(String[] args) {
        LazyRegistry lazyRegistry1 = LazyRegistry.getInstance();
        LazyRegistry lazyRegistry2 = LazyRegistry.getInstance();

        System.out.println(lazyRegistry1 == lazyRegistry2);

        LazyInitializationHolder holder1 = LazyInitializationHolder.getInstance();
        LazyInitializationHolder holder2 = LazyInitializationHolder.getInstance();
        System.out.println(holder1 == holder2);
    }
}