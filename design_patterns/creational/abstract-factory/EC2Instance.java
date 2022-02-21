public class EC2Instance implements Instance {

    public EC2Instance(Capacity capacity) {
        System.out.println("Created EC2Instance");
    }

    @Override
    public void start() {
        System.out.println("EC2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("EC2Instance storage " + storage);
    }

    @Override
    public void stop() {
        System.out.println("EC2Instance stopped");
    }
}
