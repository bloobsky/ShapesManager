import java.awt.*;
import java.util.Arrays;

public class Quadritelar extends Shape {
    
    private Point[] points;

    public Quadritelar(Point centre_point, Point[] points) {
        super(Color.PINK, false,  centre_point.get_x(), centre_point.get_y());
        this.points = points;
    }

    public Quadritelar(Point centre_point, Point p1, Point p2, Point p3, Point p4) {
        super(Color.PINK, false, centre_point.get_x(), centre_point.get_y());
        this.points = new Point[]{p1, p2, p3, p4};
    }

    public Quadritelar(Rectangle rectangle){
        super(Color.PINK , false , rectangle.get_x_centre(), rectangle.get_y_centre());

        int rectXCenter = rectangle.get_x_centre();
        int rectYCenter = rectangle.get_y_centre();
        int rectHalfWidth = (rectangle.get_width()/2);
        int rectHalfHeight = (rectangle.get_height()/2);


        Point p1 = new Point(rectXCenter - rectHalfWidth, rectYCenter - rectHalfHeight);
        Point p2 = new Point(rectXCenter + rectHalfWidth, rectYCenter - rectHalfHeight);
        Point p3 = new Point(rectXCenter + rectHalfWidth, rectYCenter + rectHalfHeight);
        Point p4 = new Point(rectXCenter - rectHalfWidth, rectYCenter + rectHalfHeight);
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

    @Override
    public BoundingBox get_bb(){

        Point[] temp_array = Arrays.copyOf(points, points.length);

        Arrays.sort(temp_array,new CompareX());
        int x1 = temp_array[0].get_x();
        int x2 = temp_array[temp_array.length-1].get_x();

        Arrays.sort(temp_array, new CompareY());
        int y1 = temp_array[temp_array.length-1].get_y();
        int y2 = temp_array[0].get_y();

        return new BoundingBox(new Point(x1,y1),new Point(x2,y2));

    }
}
