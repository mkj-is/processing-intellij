
import processing.core.*;

public class ExampleApplet extends PApplet {

    public static void main(String args[]) {
        PApplet.main("ExampleApplet");
    }

    @Override
    public void settings() {
        // TODO: Customize screen size and so on here
        size(200, 200);
    }

    @Override
    public void setup() {
        // TODO: Your custom drawing and setup on applet start belongs here
        clear();
    }

    @Override
    public void draw() {
        // TODO: Do your drawing for each frame here
        clear();
        fill(255);
        rect(50, 50, 100, 100);
    }
}
