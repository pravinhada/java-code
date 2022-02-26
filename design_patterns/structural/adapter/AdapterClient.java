public class AdapterClient {

    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter movableAdapter = new MovableAdapterImpl(bugattiVeyron);

        System.out.println(movableAdapter.getSpeed());
    }
}
