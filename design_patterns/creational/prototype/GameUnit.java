public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = new Point3D();
    }

    public GameUnit(float x, float y, float z) {
        this.position = new Point3D(x, y, z);
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    protected void initialize() {
        this.position = new Point3D();
        this.reset();
    }

    protected abstract void reset();

    public void move(Point3D direction, float distance) {
        float newX = direction.getX() + distance;
        float newY = direction.getY() + distance;
        float newZ = direction.getZ() + distance;
        this.position = new Point3D(newX, newY, newZ);
    }

    public Point3D getPosition() {
        return position;
    }
}
