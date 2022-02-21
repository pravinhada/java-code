public class SimpleClient {

    public static void main(String[] args) {
        Message message = createMessage("xml", "hello world!");

        System.out.println(message.getContent());
    }

    // simple factory method
    public static Message createMessage(String type, String message) {
        switch (type) {
            case "text":
                return new TextMessage(message);
            case "json":
                return new JsonMessage(message);
            case "xml":
                return new XmlMessage(message);
            default:
                throw new IllegalArgumentException("provide valid message type");
        }
    }
}
