public class JsonMessage extends Message {

    public JsonMessage(String message) {
        super(message);
    }

    @Override
    String getContent() {
        return String.format("{'message': '%s'}", this.getMessage());
    }
}
