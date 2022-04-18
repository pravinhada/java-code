public class RealImage implements Images {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading file from Disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Image: " + fileName);
    }
}
