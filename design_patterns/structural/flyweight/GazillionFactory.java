public class GazillionFactory {
    private Gazillion[] pool;

    public GazillionFactory(int maxRows) {
        this.pool = new Gazillion[maxRows];
    }

    public Gazillion getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }
}
