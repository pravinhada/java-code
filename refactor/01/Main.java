public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Joe");
        Movie movie = new Movie("Die Hard 2", Movie.NEW_RELEASE);
        Rental rental = new Rental(movie, 2);

        customer.addRental(rental);

        String statement = customer.statement();
        System.out.println(statement);
    }
}
