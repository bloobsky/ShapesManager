import java.awt.*;


public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Color color, boolean filled, int x_centre, int y_centre,  int width, int height) {
        super(color, filled, x_centre, y_centre);
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

}