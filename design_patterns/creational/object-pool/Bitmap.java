public class Bitmap implements  Image {
    private Point3D location;
    private String name;

    public Bitmap(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
    System.out.println("Drawing " + name + "@ location " + location);
    }

    @Override
    public Point3D getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(Point3D location) {
        this.location = location;
    }

    // should not be costly operation
    @Override
    public void reset() {
        this.location = null;
        System.out.println("Bitmap is reset");
    }
}
