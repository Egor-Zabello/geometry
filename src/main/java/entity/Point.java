package entity;

import java.util.Objects;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(Math.abs(point.x), Math.abs(x)) == 0 && Double.compare(Math.abs(point.y), Math.abs(y))==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}