public class XmlMessage extends Message {

    public XmlMessage(String message) {
        super(message);
    }

    @Override
    String getContent() {
        return String.format("<message>%s</message>", this.getMessage());
    }
}
