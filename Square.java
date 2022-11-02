import java.awt.*;

public class Square extends Rectangle{

    private int side;

    /**
     * Square class, extends Rectangle class
     * @param side size of the side of the square
     * @param color color of the square
     * @param filled true for the filled square
     * @param xCenter center point of the square on the X axis
     * @param yCenter center point of the square on the Y axis
     */
    public Square(Color color, boolean filled, int x_centre, int y_centre, int side){
        super(color, filled, x_centre, y_centre, side, side); // 2 side
        this.side = side;
    }

    public int get_side() {
        return side;
    }
}