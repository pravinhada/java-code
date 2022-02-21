public class AbstractFactoryClient {

    private ResourceFactory factory;

    public AbstractFactoryClient(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = this.factory.createInstance(cap);
        Storage storage = this.factory.createStorage(storageMib);

        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        AbstractFactoryClient aws = new AbstractFactoryClient(new AWSResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro, 2048);
        i1.start();
        i1.stop();

        AbstractFactoryClient google = new AbstractFactoryClient(new GoogleResourceFactory());
        Instance i2 = google.createServer(Instance.Capacity.small, 2048);
        i2.start();
        i2.stop();
    }
}
