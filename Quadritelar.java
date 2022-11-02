import java.awt.*;
import java.util.Arrays;

public class Quadritelar extends Shape {
    
    private Point[] points;

    public Quadritelar(Point centre_point, Point[] points) {
        super(Color.YELLOW, false, centre_point.get_x(), centre_point.get_y());
        this.points = points;
    }

    public Quadritelar(Point centre_point, Point p1, Point p2, Point p3, Point p4) {
        super(Color.YELLOW, false,  centre_point.get_x(), centre_point.get_y());
        this.points = new Point[]{p1, p2, p3, p4};
    }

    public Quadritelar(Rectangle rectangle){
        super(Color.YELLOW, false, rectangle.get_x_centre(), rectangle.get_y_centre());

        int rect_x_centre = rectangle.get_x_centre();
        int rect_y_centre = rectangle.get_y_centre();


        Point p1 = new Point(rect_x_centre - (rectangle.get_width()/2), rect_y_centre - (rectangle.get_height()/2));
        Point p2 = new Point(rect_x_centre + (rectangle.get_width()/2), rect_y_centre - (rectangle.get_height()/2));
        Point p3 = new Point(rect_x_centre + (rectangle.get_width()/2), rect_y_centre + (rectangle.get_height()/2));
        Point p4 = new Point(rect_x_centre - (rectangle.get_width()/2), rect_y_centre + (rectangle.get_height()/2));

        this.points = new Point[]{p1,p2,p3,p4};
    }

    @Override
    public void draw_shape(Graphics g, boolean draw_shape_name, boolean draw_bb) {
        g.setColor(get_color());

        if(get_fill()){
            g.fillPolygon(new int[]{points[0].get_x(),points[1].get_x(),points[2].get_x(),points[3].get_x()},
                    new int[]{points[0].get_y(),points[1].get_y(),points[2].get_y(),points[3].get_y()},points.length);
        }
        else{
            g.drawPolygon(new int[]{points[0].get_x(),points[1].get_x(),points[2].get_x(),points[3].get_x()},
                    new int[]{points[0].get_y(),points[1].get_y(),points[2].get_y(),points[3].get_y()},points.length);
        }
        draw_name(g);
        draw_bb(g);
    }

    
}
