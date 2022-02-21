// no cloning support
public class General extends GameUnit {
    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals don't support clone");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Generals are unique");
    }

    @Override
    public String toString() {
        return "General " + state + " @ " + getPosition();
    }
}
