public class Gazillion {

    // sharable row, intrinsic value
    private int row;

    public Gazillion(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    // extrinsic value
    public void report(int col) {
        System.out.print(" " + this.row + col);
    }
}
