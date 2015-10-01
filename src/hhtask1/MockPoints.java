package hhtask1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * создает заданное количество точек в заданных диапазонах координат
 * координаты задаются случайным образом
 */
public class MockPoints implements InputContract {

    /**
     * множество точек
     */
    private HashSet<Point> set;

    /**
     * генерирует точки, задавая координаты случайным образом в заданном диапазоне
     * проверяет на уникальность координат точки перед добавлением в множество
     * @param count количество генерируемых точек
     * @param range диапазон получаемых координат от 0 до range
     */
    public MockPoints(int count, int range){
        Random rand = new Random();
        set = new HashSet<Point>();
        boolean found = false;
        for (int i = 0; i < count; ++i) {
            int x = rand.nextInt(range);
            int y = rand.nextInt(range);
            Point newPoint = new Point(x, y);
            //проверка на уникальность вновь создаваемой точки
            Iterator<Point> it = set.iterator();
            while (it.hasNext()) {
                Point p = it.next();
                if (p.isEqual(newPoint)){
                    found = true;
                    break;
                }
            }
            if (found){
                --i;
                found = false;
                continue;
            }
            //если точка прошла проверку - добавляем
            set.add(newPoint);
        }
    }

    /**
     * реализует контракт InputContract
     * @return множество точек
     */
    public HashSet getSet(){
        return set;
    }
}
