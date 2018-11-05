import java.awt.*;

public class Pawn extends Piece {
    public Pawn(Point p) { super(p); }

    public boolean isLegalMove(Point a, Point b) {
        double ax = a.getX();
        double ay = a.getY();
        double bx = b.getX();
        double by = b.getY();
        return (Math.abs(ax - bx) <= 1 && by - ay <= 1) || (ax == bx && by - ay == 2);
    }

}
