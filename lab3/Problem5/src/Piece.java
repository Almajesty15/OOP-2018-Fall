import java.awt.*;

public abstract class Piece {
    Point position;

    public Piece(Point p) { position = p; }

    public abstract boolean isLegalMove(Point a, Point b);
}
