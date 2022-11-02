import java.util.ArrayList;
import java.awt.*;


public class ShapesManager {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private boolean display_name;
    private boolean display_bb;

    public void add_shape(Shape shape_to_add)
    {
        shapes.add(shape_to_add);
    }

    public void draw_shapes(Graphics g)
    {
        for(Shape s:shapes)
        {
            s.draw_shape(g, display_name, display_bb);
        }
    }
}
