package sample;

/**
 * Created by user on 7/14/16.
 */
public class Ant {
    double x;
    double y;
    String antColor;

    public Ant(double x, double y, String antColor) {
        this.x = x;
        this.y = y;
        this.antColor = antColor;
    }

    public String getColor() {
        return antColor;
    }

    public void setColor(String color) {
        this.antColor = color;
    }
}
