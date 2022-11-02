import javax.swing.*;
import java.awt.*;

public class WindowCreator {
    public static void main(String[] args) {

        ShapesManager shapes_manager = new ShapesManager();
        shapes_manager.enable_display_name(true);
        shapes_manager.enable_display_bb(true);

        CustomWindow customWindow = new CustomWindow(shapes_manager);
        customWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        customWindow.setTitle("Shapes Manager - play with Shapes");
        customWindow.setVisible(true);

        // CREATING OBJECT
        Circle c1 = new Circle(Color.RED, true, 100, 200, 50);
        Rectangle r1 = new Rectangle(Color.BLUE, true, 500, 200, 100, 100 );
        Quadritelar q1 = new Quadritelar(Color.RED, false, new Point(400,300), new Point[]{new Point(140,160), new Point(250,160), new Point(300,250), new Point(140,250)});

        shapes_manager.add_shape(c1);
        shapes_manager.add_shape(r1);
        shapes_manager.add_shape(q1);


    }
}
