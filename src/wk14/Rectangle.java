package wk14;

import java.awt.*;

public class Rectangle extends Shape implements Cloneable {
    private Dimension size;

    @Override
    public Object clone() {
        Rectangle ret = null;
        ret = (Rectangle) super.clone();
        ret.size = new Dimension(size);
        return ret;
    }

    public Rectangle(int x, int y, Color color, int width, int height) {
        super(x, y, color);
        size = new Dimension(width, height);
    }

    public Rectangle(Rectangle original) {
        super(original);
        size = new Dimension(original.size);
    }

    public void setSize(int width, int height) {
        size.setSize(width, height);
    }

    @Override
    public String toString() {
        return String.format("(%.1f x %.1f) Rectangle%s",
                size.getWidth(), size.getHeight(), super.toString().substring(5));
    }
}
