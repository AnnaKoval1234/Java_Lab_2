
import java.util.ArrayList;

public class Main
{
    void Task_1()
    {
        System.out.println("Задание 1.1: Точка координат");
        System.out.println("Создайте три точки с разными координатами.");
        for (int i = 1; i <= 3; i++)
        {
            int x = Check.inputInteger("Введите координату X: ");
            int y = Check.inputInteger("Введите координату Y: ");
            Point p = new Point(x, y);
            System.out.println("Точка " + i + ": " + p);
        }
    }
    void Task_2()
    {
        System.out.println("Задание 1.3: Имена");
        Name one = new Name("Клеопатра");
        System.out.println(one);
        Name two = new Name("Пушкин", "Александр", "Сергеевич");
        System.out.println(two);
        Name three = new Name("Маяковский", "Владимир");
        System.out.println(three);
    }
    void Task_3()
    {
        System.out.println("Задание 2.1: Прямая");
        Line l1 = new Line(1, 3, 23, 8);
        System.out.println("Линия 1: " + l1);
        Line l2 = new Line(5, 10, 25, 10);
        System.out.println("Линия 2: " + l2);
        Line l3 = new Line(l1.getBegin(), l2.getEnd());
        System.out.println("Линия 3: " + l3);

        System.out.println("Измените начало первой линии.");
        int x = Check.inputInteger("Введите координату X: ");
        int y = Check.inputInteger("Введите координату Y: ");
        l1.setBegin(x, y);
        System.out.println("Измененная линия 1: " + l1);

        System.out.println("Измените конец второй линии.");
        x = Check.inputInteger("Введите координату X: ");
        y = Check.inputInteger("Введите координату Y: ");
        l2.setEnd(x, y);
        System.out.println("Измененная линия 2: " + l2);

        System.out.println("Измененная линия 3: " + l3);

        System.out.println("Измените начало первой линии.");
        x = Check.inputInteger("Введите координату X: ");
        y = Check.inputInteger("Введите координату Y: ");
        l1.setBegin(new Point(x, y));
        System.out.println("Измененная линия 1: " + l1);

        System.out.println("Не измененная линия 3: " + l3);
    }
    void Task_4()
    {
        System.out.println("Задание 3.3: Города");

        Town a = new Town();
        Town b = new Town();
        Town c = new Town();
        Town d = new Town();
        Town e = new Town();
        Town f = new Town();
        
        a.setName("A");
        b.setName("B");
        c.setName("C");
        d.setName("D");
        e.setName("E");
        f.setName("F");
        
        ArrayList<Road> from_a = new ArrayList<Road>();
        ArrayList<Road> from_b = new ArrayList<Road>();
        ArrayList<Road> from_c = new ArrayList<Road>();
        ArrayList<Road> from_d = new ArrayList<Road>();
        ArrayList<Road> from_e = new ArrayList<Road>();
        ArrayList<Road> from_f = new ArrayList<Road>();
        
        from_a.add(new Road(b, 5));
        from_a.add(new Road(d, 6));
        from_a.add(new Road(f, 1));

        from_b.add(new Road(a, 5));
        from_b.add(new Road(c, 3));
        
        from_c.add(new Road(b, 3));
        from_c.add(new Road(d, 4));

        from_d.add(new Road(a, 6));
        from_d.add(new Road(c, 4));
        from_d.add(new Road(e, 2));

        from_e.add(new Road(f, 2));

        from_f.add(new Road(b, 1));
        from_f.add(new Road(e, 2));

        a.setRoads(from_a);
        b.setRoads(from_a);
        c.setRoads(from_a);
        d.setRoads(from_a);
        e.setRoads(from_a);
        f.setRoads(from_a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    void Task_5()
    {
        System.out.println("Задание 4.8: Создаем Города");

        Town a = new Town("A");
        Town b = new Town("B");
        Town c = new Town("C");
        Town d = new Town("D");
        Town e = new Town("E");

        ArrayList<Road> from_a = new ArrayList<Road>();
        ArrayList<Road> from_b = new ArrayList<Road>();
        ArrayList<Road> from_c = new ArrayList<Road>();
        ArrayList<Road> from_d = new ArrayList<Road>();
        ArrayList<Road> from_e = new ArrayList<Road>();
        ArrayList<Road> from_f = new ArrayList<Road>();
        
        from_b.add(new Road(a, 5));
        from_b.add(new Road(c, 3));
        b.setRoads(from_b);

        from_c.add(new Road(b, 3));
        from_c.add(new Road(d, 4));
        c.setRoads(from_c);

        from_d.add(new Road(a, 6));
        from_d.add(new Road(c, 4));
        from_d.add(new Road(e, 2));
        d.setRoads(from_d);
        
        from_f.add(new Road(b, 1));
        from_f.add(new Road(e, 2));
        Town f = new Town("F", from_f);

        from_a.add(new Road(b, 5));
        from_a.add(new Road(d, 6));
        from_a.add(new Road(f, 1));
        a.setRoads(from_a);
        
        from_e.add(new Road(f, 2));
        e.setRoads(from_e);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    void Task_6()
    {
        System.out.println("Задание 5.5: Дроби");
        System.out.println("Создайте две дроби.");

        int num = Check.inputInteger("Введите числитель: ");
        int den = Check.inputInteger("Введите знаменатель: ");
        Fraction f1 = new Fraction(num, den);
        System.out.println("Дробь 1: " + f1);

        num = Check.inputInteger("Введите числитель: ");
        den = Check.inputInteger("Введите знаменатель: ");
        Fraction f2 = new Fraction(num, den);
        System.out.println("Дробь 2: " + f2);

        System.out.println(f1 + " + " + f2 + " = " + f1.sum(f2));
        System.out.println(f1 + " - " + f2 + " = " + f1.minus(f2));
        System.out.println(f1 + " * " + f2 + " = " + f1.mult(f2));
        System.out.println(f1 + " : " + f2 + " = " + f1.div(f2));
        
        System.out.println("Создайте еще одну дробь.");
        num = Check.inputInteger("Введите числитель: ");
        den = Check.inputInteger("Введите знаменатель: ");
        Fraction f3 = new Fraction(num, den);
        System.out.println("Дробь 3: " + f3);

        int x = Check.inputInteger("Введите число: ");

        System.out.println(f3 + " + " + x + " = " + f3.sum(x));
        System.out.println(f3 + " - " + x + " = " + f3.minus(x));
        System.out.println(f3 + " * " + x + " = " + f3.mult(x));
        System.out.println(f3 + " : " + x + " = " + f3.div(x));

        System.out.println("( " + f1 + " + " + f2 + " ) : " + f3 + " - " + 5 + " = " + f1.sum(f2).div(f3).minus(5));
    }
    public static void main(String args[])
    {   
        Main m = new Main();
        m.Task_1(); 
        m.Task_2();
        m.Task_3();
        m.Task_4();
        m.Task_5();
        m.Task_6();
    }
}