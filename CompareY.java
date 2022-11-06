import java.util.Comparator;

/* returning differences between points X */
public class CompareY implements Comparator<Point> {
    
    @Override
    public int compare(Point n1, Point n2){
        return n1.get_y() - n2.get_y();
    }
}
