package wk14;

import java.awt.Color;
import java.awt.Point;

public class Shape implements Cloneable {
    private Color color;
    private Point center;

    public Shape(int x, int y, Color color) {
        this(new Point(x, y), color);
    }

    public Shape(Point center, Color color) {
        this.color = new Color(color.getRGB());
        this.center = new Point(center);
    }

    @Override
    public Object clone() {
        Shape ret = null;
        try {
            ret = (Shape) super.clone();
            ret.color = new Color(color.getRGB());
            ret.center = new Point(center);
        } catch (CloneNotSupportedException e) {
            //
        }
        return ret;
    }

    public Shape(Shape original) {
        this(original.center, original.color);
    }

    public void setX(int x) {
        center.setLocation(x, center.getY());
    }

    public void setY(int y) {
        center.setLocation(center.getX(), y);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Shape at (%.1f, %.1f) with color: #%x",
                center.getX(), center.getY(), color.getRGB());
    }
}
