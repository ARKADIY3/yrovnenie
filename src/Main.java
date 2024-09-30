import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(); // Просто отступ

        System.out.print("Введите число а:" );
        int a = in.nextInt();                   // Ввод числa a

        System.out.print("Введите число b:" );
        int b = in.nextInt();                   // Ввод числа b

        System.out.print("Введите число c:" );
        int c = in.nextInt();                   // Ввод числа с

        System.out.println(); // Просто отступ

        double y = 0;

        double d = (Math.pow(b,2)) - (4 * a * c); // Формула нахождения дискременанта
        System.out.println("Дискременант : " + d); // Вывод дискременанта

        System.out.println(); // Просто отступ

        double x1 = (-(b) - Math.sqrt(d)) / (2 * a); // !!!!!!!!!!!!
        System.out.println("x1 = " + x1); // Вывод первого корня

        double x2 = (-(b) + Math.sqrt(d)) / (2 * a); // Нахождение второго корня
        System.out.println("x2 = " + x2); // Вывод второго корня

        System.out.println(); // Просто отступ

        y = (a * Math.pow(x1,2)) + (b * x1) + c; // Формула вычесления квадратных уровнений
        System.out.println("Уровнение с первым корнем равно : " + y);

        y = (a * Math.pow(x2,2)) + (b * x2) + c;
        System.out.println("Уровнение с вторым корнем равно : " + y);

        System.out.println(); // Просто отступ

        if(d<0){
            System.out.println("Случай комплексных корней");
        }
        else if (a != 0 && b==0 && c==0){
            System.out.println("Нулевые корни");
        }else if (a == 0 && b == 0 && c==0){
            System.out.println("Неразрешимое уровнение");
        }
        else if (a == 0 && b == 0){
            System.out.println("Неразрешимое уровнение");
        }
        else if (a==0 && d>0){
            System.out.println("Неквадратное уровнение");
        }
        else if (x1==0 || x2==0){
            System.out.println("Нулевой корень");
        }
        else{
            System.out.println("Случай вещественных корней ");
        }
    }
}


