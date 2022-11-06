import java.util.Comparator;
/* returning differences between points X */
public class CompareX implements Comparator<Point> {
    
  @Override
    public int compare(Point n1, Point n2){
        return n1.get_x() - n2.get_x();
    }
}
