public class JsonMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage(String message) {
        return new JsonMessage(message);
    }
}
