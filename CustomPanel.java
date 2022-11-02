import javax.swing.*;
import java.awt.*;

/**
 * This allows us to create a panel which we can add to a frame/window
 * Oftentimes, you would then add standard GUI components, e.g. JButton, JLabel, to the
 * panel.
 * In our case, though, we will want to draw shapes, so we override the paintComponent() method
 * that we inherit from the javax.swing.JPanel class.
 * The graphics system passes us a java.awt.Graphics object and this has methods which allows us
 * to draw shapes.
 */
public class CustomPanel extends JPanel {

    private ShapesManager shapes_manager;

    public CustomPanel(ShapesManager shapes_manager) {
        this.shapes_manager = shapes_manager;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapes_manager.draw_shapes(g);

    }

}