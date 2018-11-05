import java.awt.*;

public class King extends Piece {
    public King(Point p) { super(p); }

    public boolean isLegalMove(Point a, Point b) {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return Math.abs(ax - bx) <= 1 && Math.abs(ay - by) <= 1;
    }
}
