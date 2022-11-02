/*  Circle class that inherits from Shape class
 var radius = radius
color filled, x_centre and y_centre inherited from Shape


draw shape
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
    public void draw_shape(Graphics g, boolean draw_shape_name, boolean draw_bb) {
        g.setColor(get_color());
        if (get_fill()) g.fillOval(get_x_centre()-radius, get_y_centre()-radius, radius*2, radius*2); // simple math fill the object with color
        else g.drawOval(get_x_centre()-radius, get_y_centre()-radius, radius*2, radius*2); // here different function just to not fill the object with color

        draw_name(g);
        draw_bb(g);
    }

    @Override
    public BoundingBox get_bb() {
        BoundingBox box = new BoundingBox(new Point(get_x_centre()-radius, get_y_centre()+radius), new Point(get_x_centre()+radius, get_y_centre() - radius));
        return box; // returning bounding box to circle using simple math
    }

}
