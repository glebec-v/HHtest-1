package hhtask1;


import java.util.HashSet;
import java.util.Iterator;

/**
 * основной рабочий класс
 * создается с помощью контракта InputContract
 * реализует необходимые для решения задачи методы getRadius() и getNeighbors()
 */
public class PlaneOfPoints {

    /**
     * множество точек
     */
    private HashSet<Point> set;

    /**
     * принимает сформированное множество точек
     * @param plane экземпляр множетва точек в соответствии с контрактом InputContract
     */
    public PlaneOfPoints(InputContract plane){
        set = plane.getSet();
    }

    /**
     * вычисляет радиус точки по правилу:
     *  - радиус = расстояние до ближайшей точки
     * @param point точка, для которой вычисляется радиус по условиям задачи
     * @return радиус точки
     */
    public double getRadius(Point point){
        double radius = 1000000;
        double distance;
        set.remove(point);  // забираем из коллекции для сравнения со всеми остальными
        Iterator<Point> it = set.iterator();
        while (it.hasNext()) {
            Point otherPoint = it.next();
            distance = point.distanceToNext(otherPoint);
            radius = distance < radius ? distance : radius;
        }
        set.add(point); // восстанавливаем коллекцию
        return radius;
    }

    /**
     * вычисляет количество соседей по правилу:
     *  - "Соседями" точки A называются все точки,
     *  - лежащие в пределах двойного радиуса от неё включительно (кроме самой точки A)
     * @param point точка, для которой вычисляется количество соседей
     * @return количество соседей
     */
    public int getNeighbors(Point point){
        int countNeighbors = 0;
        double distance;
        double radius = getRadius(point);
        set.remove(point);
        Iterator<Point> it = set.iterator();
        while (it.hasNext()) {
            Point otherPoint = it.next();
            distance = point.distanceToNext(otherPoint);
            if (distance <= 2*radius) ++countNeighbors;
        }
        set.add(point);
        return countNeighbors;
    }

    /**
     * преобразует множество точек в массив
     * @return массив точек (объектов типа Point)
     */
    public Point[] toArray(){
        Point[] a = new Point[set.size()];
        return set.toArray(a);
    }
}
