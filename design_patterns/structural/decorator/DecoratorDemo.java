public class DecoratorDemo {

    public static void main(String[] args) {
        Widget widget = new BorderDecorator(new ScrollDecorator(new TextField(10, 15)));
        widget.draw();
    }
}
