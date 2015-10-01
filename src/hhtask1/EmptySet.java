package hhtask1;

import java.util.HashSet;

/**
 * класс заглушка, для корректной работы метода
 * public static PlaneOfPoints makePlaneOfPoints() в классе Main
 */
public class EmptySet implements InputContract {
    public HashSet<Point> set;
    public HashSet getSet(){
        return set;
    }
}
