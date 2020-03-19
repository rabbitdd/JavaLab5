package main;
/**
 * Класс Сoordinates
 * @author Мишанин Никита
 */
public class Coordinates {
    private float x; //Поле не может быть null
    private Integer y;

    public Coordinates(float x, int y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
