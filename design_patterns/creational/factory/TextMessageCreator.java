public class TextMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage(String message) {
        return new TextMessage(message);
    }
}
