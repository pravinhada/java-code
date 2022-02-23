public interface Image extends Poolable{
    void draw();
    Point3D getLocation();
    void setLocation(Point3D location);
}
