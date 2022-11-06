import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This allows us to create a panel which we can add to a frame/window
 * Oftentimes, you would then add standard GUI components, e.g. JButton, JLabel, to the
 * panel.
 * In our case, though, we will want to draw shapes, so we override the paintComponent() method
 * that we inherit from the javax.swing.JPanel class.
 * The graphics system passes us a java.awt.Graphics object and this has methods which allows us
 * to draw shapes.
 * 
 * MouseListener class derives from java.awt.event
 */
public class CustomPanel extends JPanel {

    private ShapesManager shapes_manager;

    public CustomPanel(ShapesManager shapes_manager) {
        this.shapes_manager = shapes_manager;
        addMouseListener();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        shapes_manager.draw_shapes(g);

    }

    private void addMouseListener() {

        addMouseListener(new MouseAdapter()  {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                for (Shape s:shapes_manager.get_shapes()) {
                    BoundingBox bb = s.get_bb();

                    int mouseX = e.getPoint().x;
                    int mouseY = e.getPoint().y;

                    Point bl  = bb.get_bl_corner();
                    Point tr = bb.get_tr_corner();

                    if((mouseX>= bl.get_x() && mouseX <= tr.get_x()) && (mouseY >= tr.get_y()) && mouseY<= bl.get_y() ) {
                        if(e.getButton() == MouseEvent.BUTTON1) s.change_fill();

                        if(e.getButton() == MouseEvent.BUTTON3) {
                            if(s instanceof MoveIt) ((MoveIt) s).move_unit();
                            if(s instanceof RotateIt) ((RotateIt) s).rotate_unit();
                        }
                    CustomPanel.super.repaint();
                    }
                }    
            }    
        });
    }
}







