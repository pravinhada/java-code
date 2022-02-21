public class Car {
    private String model;
    private String make;
    private String year;
    private String color;
    private String power;

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year='" + year + '\'' +
                ", color='" + color + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

    // private constructor to make car immutable and singleton
    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.make = builder.make;
        this.year = builder.year;
        this.color = builder.color;
        this.power = builder.power;
    }

    // static builder class
    public static class CarBuilder {
        private String model;
        private String make;
        private String year;
        private String color;
        private String power;

        CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        CarBuilder make(String make) {
            this.make = make;
            return this;
        }

        CarBuilder year(String year) {
            this.year = year;
            return this;
        }

        CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        CarBuilder power(String power) {
            this.power = power;
            return this;
        }

        Car build() {
            return new Car(this);
        }
    }
}