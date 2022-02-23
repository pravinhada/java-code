public class EagerRegistry {

    private EagerRegistry() {
    }

    private static final EagerRegistry instance = new EagerRegistry();

    public static EagerRegistry getInstance() {
        return instance;
    }
}
