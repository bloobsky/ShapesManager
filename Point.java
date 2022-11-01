/* Point Class to allows
 * choose a point on x and y axis
 * getX - return X position
 * getY - return Y postion
 * setX - sets X position
 * setY - sets Y position.
 * 
 */

public class Point {
    
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;  // describe x axis (horizontal)
        this.y = y;  // describe y axis (vertical)
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
