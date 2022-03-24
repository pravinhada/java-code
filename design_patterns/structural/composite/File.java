public class File implements AbstractFile {
    private String fileName;
    private float length;

    public File(String fileName, float length) {
        this.fileName = fileName;
        this.length = length;
    }

    @Override
    public void ls() {
        System.out.println(" - File: " + this.fileName + ": [" + this.length + "mins]");
    }
}
