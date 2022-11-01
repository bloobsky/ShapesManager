
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


    @Override
    protected void paintComponent(Graphics g) {
        //The superclass does some important work in the method we've overridden, so we
        //should invoke it.
        super.paintComponent(g);

        g.setColor(Color.blue);
        //Here's an example of a shape.
        //For our panels, the origin (0,0) is the top left corner
        //This means that the +ve Y axis is "down", i.e. it's the opposite
        //of the familiar cartesian coordinate system.
        g.drawRect(5,20, 40,60);

        //Exercises:
        //1: Draw an oval that fits exactly within the rectangle above
        //2: Draw an oval that fills the entire panel. NOTE: the panel class has getters for its width and height.
        //3: Draw a circle of radius 25 that is centered in the center of the panel. Make the window bigger/smaller and
        //      verify that it remains centered.
        //4: See if you can find (using intellisense) the method required to draw a filled version of the circle from
        //      exercise 3.
        g.setColor(Color.red);

        int circleRadius = 25;
        g.drawOval(this.getWidth()/2 - circleRadius,
                this.getHeight()/2 - circleRadius,
                circleRadius * 2,
                circleRadius*2);
    }

}
