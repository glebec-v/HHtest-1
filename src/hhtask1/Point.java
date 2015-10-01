package hhtask1;

/**
 * базовый класс для точки
 */
public class Point {
    /**
     * координаты точки
     * x, y положительные целые числа
     */
    private int x,y;

    /**
     * конструктор, проверяет координаты на условие >0
     * если координата отрицательная, то она принимается равной 0
     * @param _x
     * @param _y
     */
    public Point(int _x, int _y){
        x = _x > 0 ? _x : 0;
        y = _y > 0 ? _y : 0;
    }

    /**
     * @return координату x
     */
    public int getX(){ return x; }


    /**
     * @return координату y
     */
    public int getY(){ return y; }

    /**
     * вычисляет расстояние между двумя точками
     * @param nextPoint точка, до которой измеряется расстояние
     * @return расстояние
     */
    public double distanceToNext(Point nextPoint){
        int dx = Math.abs(x - nextPoint.getX());
        int dy = Math.abs(y - nextPoint.getY());
        return Math.hypot(dx, dy);
    }

    /**
     * Проверяет "равны" ли точки.
     * Точки "равны", если равны их соответствующие координаты
     * @param nextPoint точка, которая проверяется на равенство
     * @return true/false
     */
    public boolean isEqual(Point nextPoint){
        return x == nextPoint.getX() && y == nextPoint.getY();
    }

    /**
     * @return строка с координатами точки через запятую
     */
    public String show(){
        return x + "," + y;
    }

}
