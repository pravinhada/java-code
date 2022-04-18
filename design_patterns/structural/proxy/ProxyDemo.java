public class ProxyDemo {

    public static void main(String[] args) {
        Images images = new ProxyImage("test_image.jpg");

        // load file from disk for first time
        images.display();

        // doesn't load second time,
        images.display();
    }
}
