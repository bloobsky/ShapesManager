/* Shape Class
 * Color - color of the object
 * filled - boolean if object filled with color (1 yes, 0 no)
 * x_centre = x axis (horizontal) position of the centre of the object
 * y_centre = y axis (vertical)  position of the centre of the object
 * 
 * draw_shape function - will draw a shape based on the rest of variables
 * draw_name function - allows to get the name of the object (via getSimpleName)
 * 
 * get_x_centre = return centre of shape (horizontal) x 
 * get_y_centre = return centre of shape (vertical) y
 * get_fill = 1 when filled 0 when not
 * get_color = return color
 * 
 * change_fill = changes filled from 0 to 1 
 * set_x_centre = sets centre of shape horizontal x
 * set_y_centre = sets centre of shape vertical y
 * set_color = sets color
 * 
 */
import java.awt.*;

public abstract class Shape {

    protected Color color;
    protected boolean filled;
    protected int x_centre;
    protected int y_centre;

    public Shape(Color color, boolean filled, int x_centre, int y_centre) {
        this.color = color;
        this.filled = filled;
        this.x_centre = x_centre;
        this.y_centre = y_centre;
    }

    public Shape(Color color, int x_centre, int y_centre) {
        this.color = color;
        this.x_centre = x_centre;
        this.y_centre = y_centre;
    }

    public abstract void draw_shape(Graphics g, boolean draw_shape_name, boolean draw_bb);
    public abstract BoundingBox get_bb();

    protected void draw_name(Graphics g) {
        if(filled) {
            g.setColor(Color.WHITE);
        }
        else {
            g.setColor(Color.BLACK);
            g.drawString(this.getClass().getSimpleName(), x_centre , y_centre);
        // - 20 pixels on X axis so object is more centred 
        // temporary solution perhaps change color of the font 
        }
    }

    protected void draw_bb(Graphics g) {
        BoundingBox bb = get_bb();
        g.setColor(Color.GRAY);
        
        int x_axis = bb.get_bl_corner().get_x();
        int y_axis = bb.get_bl_corner().get_y();
        int width = bb.get_tr_corner().get_x() - bb.get_bl_corner().get_x();
        int height = bb.get_bl_corner().get_y() - bb.get_tr_corner().get_x();

        g.drawRect(x_axis, y_axis, width, height);

    }

    public int get_x_centre() {
        return x_centre;

    }

    public int get_y_centre() {
        return y_centre;   
    }

    public boolean get_fill() {
        return filled;
    }

    public Color get_color() {
        return color;
    }

    public void change_fill() {
        filled = !filled;
        }
    
    public void set_x_centre() {
        this.x_centre = x_centre;
    }

    public void set_y_centre () {
        this.y_centre = y_centre;
    }

    public void set_color() {
        this.color = color;
    }


}
