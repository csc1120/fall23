package wk14;

import java.awt.Color;

public class Driver {
    public static void main(String[] args) {
        Shape s1 = null;
        if (Math.random() < .5) {
            s1 = new Shape(0, 0, Color.YELLOW);
        } else {
            s1 = new Rectangle(0, 0, new Color(3, 8, 7), 10, 20);
        }
        System.out.println(s1);
        Shape s2 = (Shape) s1.clone();
/*        if (s1 instanceof Rectangle rect) {
            s2 = new Rectangle(rect);
        } else {
            s2 = new Shape(s1);
        }
 */
        System.out.println(s2);
    }

}
