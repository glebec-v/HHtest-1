package hhtask1;

import java.util.HashSet;

/**
 * Тестовый класс для проверки правильности расчетов
 */
public class FixedPoints implements InputContract {

    /**
     * множество точек
     */
    private HashSet<Point> set;

    /**
     * создает фиксированный набор точек
     * использовалось для тестирования вручную
     */
    public FixedPoints(){
        set = new HashSet<Point>();
        Point p1 = new Point(1,1);
        set.add(p1);
        Point p2 = new Point(5,1);
        set.add(p2);
        Point p3 = new Point(5,5);
        set.add(p3);
        Point p4 = new Point(10,10);
        set.add(p4);
        Point p5 = new Point(6,6);
        set.add(p5);
    }

    /**
     * реализует контракт InputContract
     * @return множество точек
     */
    public HashSet getSet(){
        return set;
    }
}
