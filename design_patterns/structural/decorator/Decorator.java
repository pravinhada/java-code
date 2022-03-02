// second level base class with is a relationship
public abstract class Decorator implements Widget {
    // has a relationship
    private Widget widget;

    public Decorator(Widget widget) {
        this.widget = widget;
    }

    // delegates to the implementors
    @Override
    public void draw() {
        widget.draw();
    }
}
