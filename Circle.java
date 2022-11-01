/*  Circle class that inherits from Shape class
 var radius = radius
color filled, x_centre and y_centre inherited from Shape
*/
import java.awt.*;

public class Circle extends Shape {
    private int radius; // radius is needed only to create circle


    public Circle(Color color, boolean filled, int x_centre, int y_centre, int radius)
    {
        super(color, filled, x_centre, y_centre);
        this.radius = radius;
    }
    
    @Override
    public void draw_shape(Graphics g, boolean display_) {
        System.out.println(this.toString());
    }

}
