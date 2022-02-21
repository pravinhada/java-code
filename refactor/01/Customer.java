import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String statement() {
        String result = "Rental Record for " + this.getName() + "\n";

        for (Rental rental : this.rentals) {

            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
        }
        result += "Amount owed is " + String.valueOf(this.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(this.getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h1>Rental Record for <em>" + this.getName() + "</em></h1><p>\n";
        for (Rental rental : this.rentals) {
            result += rental.getMovie().getTitle() + ": " + String.valueOf(rental.getCharge()) + "</br>\n";
        }
        result += "<p>Amount owe <em>" + String.valueOf(this.getTotalCharge()) + "</em><p>\n";
        result += "You earned <em>" + String.valueOf(this.getFrequentRenterPoints())
                + "</em> frequent renter points<p>";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental rental : this.rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    private int getFrequentRenterPoints() {
        int result = 0;
        for (Rental rental : this.rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }
}
