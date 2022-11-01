/* BoundingBox class
 * bottom_left = bottom left corner (on rectangle shaped bounding box)
 * top_right = top right corner -- ** --
 * get_bl_corner - return  bottom  left corner
 * get_tr_corner - return top right corner
 * set_bl_corner - sets bottom left corner
 * set_tr_corner - sets top right corner
 */


public class BoundingBox {
    private Point bottom_left; // bottom left point
    private Point top_right; //  top right point

    public BoundingBox(Point bottom_left, Point top_right) {
        this.bottom_left = bottom_left;
        this.top_right = top_right;
    }

    public Point get_bl_corner() {
        return bottom_left;
    }

    public Point get_tr_corner() {
        return top_right;
    }

    public void set_bl_corner() {
        this.bottom_left = bottom_left;
    }

    public void set_tr_corner() {
        this.top_right = top_right;
    }
}
