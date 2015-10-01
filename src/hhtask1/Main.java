package hhtask1;

import java.util.Scanner;

public class Main {

    /**
     * точка входа в приложение
     * вызов метода генерации набора точек на плоскости и вывод результатов вычислений
     */
    public static void main(String[] args) {
        PlaneOfPoints p = makePlaneOfPoints();
        Point[] set = p.toArray();
        double radius;
        for(Point a: set){
            radius = p.getRadius(a);
            System.out.printf("point \t%s \thas radius %.4f and %3d neighbour(s)\n",
                    a.show(), radius, p.getNeighbors(a));
        }
    }

    /**
     * генерирует обьект с точками на плоскости различными способами
     * в зависимости от выбора пользователя
     * доступные способы генерации:
     *  1. Фиксированный заранее забор
     *  2. Случайный набор точек
     *  3. Ручной ввод точек пользователем
     * @return объект типа PlaneOfPoints
     */
    public static PlaneOfPoints makePlaneOfPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose points make method");
        System.out.println("Fixed - 1, Random - 2, Manual - 3");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                return new PlaneOfPoints(new FixedPoints());
            case 2:
                System.out.println("Choose quantity of points and range");
                int quantity = sc.nextInt();
                int range = sc.nextInt();
                return new PlaneOfPoints(new MockPoints(quantity, range));
            case 3:
                return new PlaneOfPoints(new ManualPoints());
        }
        return new PlaneOfPoints(new EmptySet()); // заглушка, никогда не вызывается
    }
}