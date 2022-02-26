public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCar;

    public MovableAdapterImpl(Movable luxuryCar) {
        this.luxuryCar = luxuryCar;
    }

    @Override
    public double getSpeed() {
        return this.convertMPHToKMPH(this.luxuryCar.getSpeed());
    }

    private double convertMPHToKMPH(double mph) {
        return mph * 1.60934;
    }
}
