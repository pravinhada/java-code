public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attach() {
        this.state = "attacking";
    }

    @Override
    protected void reset() {
        this.state = "idle";
    }

    @Override
    public String toString() {
        return "Swordsman " + state + " @ " + getPosition();
    }
}
