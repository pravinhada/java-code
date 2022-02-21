public class TextMessage extends Message {

    public TextMessage(String message) {
        super(message);
    }

    @Override
    String getContent() {
        return "message: " + this.getMessage();
    }
}
