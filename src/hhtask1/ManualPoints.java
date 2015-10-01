package hhtask1;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * создает множество точек, запрашивая у пользователя координаты
 */
public class ManualPoints implements InputContract {

    /**
     * множество точек
     */
    private HashSet<Point> set;

    /**
     * ручной ввод координат точек на плоскости
     */
    public ManualPoints(){
        Scanner sc = new Scanner(System.in);
        set = new HashSet<Point>();
        String inputBuffer;
        String[] inputArray;
        while(true) {
            System.out.println("Input x,y or \"exit\"");
            inputBuffer = sc.nextLine();
            if (inputBuffer.equalsIgnoreCase("exit"))
                break;
            inputArray = inputBuffer.split(",");
            Point newPoint = new Point(parseInt(inputArray[0]), parseInt(inputArray[1]));
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
