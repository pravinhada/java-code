public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacity) {
        System.out.println("GoogleCompute storage " + capacity + " size created");
    }

    @Override
    public String getId() {
        return "gcs1";
    }
}
