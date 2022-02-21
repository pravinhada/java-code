public class CarBuilder {

    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder().model("Camry").make("Toyota").year("2005").color("black").power("25hp").build();
        Car car2 = new Car.CarBuilder().model("Camry").make("Toyota").year("2005").color("black").power("25hp").build();
        System.out.println(car1 == car2);
        System.out.println(car1);
    }
}
