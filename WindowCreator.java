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

        shapes_manager.add_shape(new Circle( Color.RED, true, 100, 200, 50));

    }
}
