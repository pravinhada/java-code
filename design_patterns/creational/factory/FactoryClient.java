public class FactoryClient {

    public static void main(String[] args) {
        printMessage(new TextMessageCreator());
        printMessage(new JsonMessageCreator());
        printMessage(new XmlMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.createMessage("Hello world");
        System.out.println(msg.getContent());
    }
}
