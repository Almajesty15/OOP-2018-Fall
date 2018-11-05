import java.awt.*;

public class Rook extends Piece {
    public Rook(Point p) { super(p); }

    public boolean isLegalMove(Point a, Point b) {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return ax == bx || ay == by;
    }
}
