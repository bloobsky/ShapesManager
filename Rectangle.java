/* The rectangle class
 * color filled, x_centre and y_centre inherited from Shape
 * width = width of rectangle
 * height = height of rectangle
 * 
 * get_width = return width value
 * get_height = return height value
 * move_unit from MoveIt to move the Object 10 px to the right
 * move_shape from MoveIt to move it actually
 * 
 * 
 */

import java.awt.*;


public class Rectangle extends Shape implements MoveIt{

    private int width;
    private int height;

    public Rectangle(Color color, boolean filled, int x_centre, int y_centre,  int width, int height) {
        super(color, filled, x_centre, y_centre);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Color color, int x_centre, int y_centre, int width, int height) {
        super(color, x_centre, y_centre);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw_shape(Graphics g, boolean draw_shape_name, boolean draw_bb) {
        g.setColor(get_color());
        if (get_fill()) g.fillRect(get_x_centre()-(width/2), get_y_centre()-(height/2),width,height ); // simple math fill the object with color
        else g.drawRect(get_x_centre()-(width/2), get_y_centre()-(height/2),width,height); // here different function just to not fill the object with color

        draw_name(g);
        draw_bb(g);
        }   
     
        @Override
        public BoundingBox get_bb() {
            Point x = new Point(get_x_centre() - (width / 2), get_y_centre() + (height / 2));
            Point y = new Point(get_x_centre() + (width / 2), get_y_centre() - (height / 2));
            return new BoundingBox(x, y);
        }   
        
        public int get_width() {
            return width;
        }

        public int get_height() {
            return height;
        }

        @Override
        public void move_unit() {
            set_x_centre(get_x_centre() + 10);
        }
        
        @Override
        public void move_shape(int x, int y ) {
            set_x_centre(get_x_centre() + x);
            set_y_centre(get_y_centre() + y);
        }

}