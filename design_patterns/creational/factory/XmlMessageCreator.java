public class XmlMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage(String message) {
        return new XmlMessage(message);
    }
}
