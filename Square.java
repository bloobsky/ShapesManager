/**
* Square class, extends Rectangle class
color, filled, x_centre, y_centre inherited from Rectangle
side - that comes from width and height of rectangle
as square has the same side 

func get_side return side 
     */

import java.awt.*;

public class Square extends Rectangle{

    private int side;

    public Square(Color color, boolean filled, int x_centre, int y_centre, int side){
        super(color, filled, x_centre, y_centre, side, side); // 2 side
        this.side = side;
    }

    public int get_side() {
        return side;
    }
}