public class S3Storage implements Storage {

    public S3Storage(int capacity) {
        System.out.println("Allocated " + capacity + " size on s3");
    }

    @Override
    public String getId() {
        return "S3";
    }
}
