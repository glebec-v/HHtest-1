# HHtest-1, step-2.

## Условие задачи №1: Точки
Даны N точек на плоскости (для простоты можно считать, что у всех точек целочисленные координаты).
Назовём расстояние от точки A до ближайшей к ней точки B "радиусом" точки A. "Соседями" точки A будем называть все точки,
 лежащие в пределах двойного радиуса от неё включительно (кроме самой точки A).
Для каждой точки из заданного набора определите её радиус и количество соседей.

##Описание решения: 
Класс Point содержит координаты точки и основные операции над ней, включая измерение расстояния до
другой точки. В классе PlaneOfPoints реализованы методы, отвечающие на поставленные в задаче вопросы. (см. комментарии
в коде). Данные (множество точек) хранятся в поле типа коллекции HashSet (наиболее близко подходящая по свойствам
коллекция). В класс PlaneOfPoints множество точек передается в качестве параметра в конструктор. За формирование
множества точек отвечают классы:
  - ManualPoints - ручной ввод координат точек
  - FixedPoints  - фиксированнное множество точек (использовалось для тестирования)
  - MockPoints   - случайный набор с задаваемым диапазоном координат и количеством точек
Интерфейс InputContract является обобщением свойств подготовительных классов, позволяющий передать множества точек,
сформированные по-разному, одним общим способом (класс PlaneOfPoints ничего не знает о способе формирования множества
точек).

Для запуска программы нужно использовать приложенный ```out/artifacts/task1.jar``` файл. Если Java не установлена, JDK можно скачать тут: http://www.oracle.com/technetwork/java/javase/downloads/index.html и выполнить инструкции по установке
После установки JDK можно набрать в командной строке
```java -jar task1.jar```
