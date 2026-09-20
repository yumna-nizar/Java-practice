package ShapesDrawing;

import java.awt.*;

public class ShapesMain {
    static void main() {
        Shapes[] s={new Rectangle(),new Triangle(),new Circle()};

       for(Shapes shape:s)
       {
           shape.draw();
       }
    }
}
