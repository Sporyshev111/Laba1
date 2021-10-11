package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {


	// Task 1
//        System.out.println("Введите число:");
//        Scanner scanner = new Scanner(System.in);
//        double x = scanner.nextDouble();
//        x = x*10;
//        int d= (int) x;
//        d= d %10;
//        System.out.println(d);







        // Task 2

//        int hour,min,sec;
//        System.out.println("Сколько секунд: ");
//        Scanner scanner = new Scanner(System.in);
//        sec = scanner.nextInt();
//        hour =sec/3600;
//        System.out.println("Прошло "+hour+" часов.");
//        sec -= hour*3600;
//        min = sec/60;
//        System.out.println("Прошло "+min+" минут.");






        // Task 3

//        int h,m,s;
//        double Result;
//        System.out.println("Часов: ");
//        Scanner scanner = new Scanner(System.in);
//        h = scanner.nextInt();
//        System.out.println("Минут: ");
//        m = scanner.nextInt();
//        System.out.println("Секунд: ");
//        s = scanner.nextInt();
//        if(h >= 0 && m >= 0 && s>= 0) {
//            if (h <= 11 && m <= 59 && s <= 59) {
//                h = h % 12;
//                s = h * 3600 + m * 60 + s;
//                Result = 360 * s / 12 / 3600;
//
//                System.out.println(Result + " градусов");
//            } else {
//                System.out.println("Проверьте данные 0 ≤ h ≤ 11; 0 ≤ m, s ≤ 59");
//            }
//        }
//        else {System.out.println("Проверьте данные 0 ≤ h ≤ 11; 0 ≤ m, s ≤ 59");}
//







        // Task 4
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите значение a: ");
//        int a = scanner.nextInt();
//
//
//        System.out.println("Введите значение b: ");
//        int b = scanner.nextInt();
//
//        a = a + b; // a = 8, b = 5
//        b = a - b; // a = 8, b = 3
//        a = a - b; // a = 5, b = 3
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);







       // Task 5
//        Scanner scanner = new Scanner(System.in);
//        int a,b;
//        double c,S,P;
//        System.out.println("Введите первый катет: ");
//        a = scanner.nextInt();
//        System.out.println("Введите второй катет: ");
//        b =scanner.nextInt();
//        if (a>0&&b>0)
//        {
//             c = Math.sqrt(a * a + b * b);
//             P = a+b+c;
//            System.out.println(P);
//            S = (a*b)/2;
//            System.out.println(S);
//        }
//else {
//            System.out.println("Повторите ввод");
//        }


        // Task 6
//        System.out.println("Введите число:");
//int a,p;
//        Scanner scanner = new Scanner(System.in);
//        a = scanner.nextInt();
//if(a>=0) {
//    p = (a / 1000) * (a / 100 % 10) * (a / 10 % 10) * (a % 10);
//    System.out.println("Произведение чисел: "+p);
//}
//else {
//    System.out.println("Повторите ввод");
//}




        // Task 7


//        System.out.println("Введите число:");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n>=0) {
//
//
//            int reversed = n % 10;
//            while ((n /= 10) != 0) reversed = reversed * 10 + n % 10;
//
//            System.out.println("Обратный порядок: " + reversed);
//        }
//        else {
//            System.out.println("Повторите ввод: ");
//        }

        // Task 8

//        System.out.println("Введите число:");
//        Scanner scanner = new Scanner(System.in);
//
//        double x,p;
//        x = scanner.nextInt();
//
//        p = (((3*x - 5)*x + 2)*x - 1)*x + 7;
//        System.out.println(p);






        // Task 9
//        double a1, a2, a3, b1, b2, b3, c1, c2, c3, d1, d2, d3, x, y, z;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Заполните матрицу:");
//        System.out.println("a1 = ");
//        a1 =scanner.nextDouble();
//
//        System.out.println("a2 = ");
//        a2 = scanner.nextDouble();
//
//        System.out.println("a3 = ");
//        a3 = scanner.nextDouble();
//
//        System.out.println("b1 = ");
//        b1 = scanner.nextDouble();
//
//        System.out.println("b2 = ");
//        b2 = scanner.nextDouble();
//
//        System.out.println("b3 = ");
//        b3 = scanner.nextDouble();
//
//        System.out.println("c1 = ");
//        c1 = scanner.nextDouble();
//
//        System.out.println("c2 = ");
//        c2 = scanner.nextDouble();
//
//        System.out.println("c3 = ");
//        c3 = scanner.nextDouble();
//
//        System.out.println("d1 = ");
//        d1 = scanner.nextDouble();
//
//        System.out.println("d2 = ");
//        d2 = scanner.nextDouble();
//
//        System.out.println("d3 = ");
//        d3 = scanner.nextDouble();
//
//        double delta = a1 * b2 * c3 + b1 * c2 * a3 + c1 * a2 * b3 - c1 * b2 * a3 - b1 * a2 * c3 - a1 * c2 * b3;
//        double delta1 = d1 * b2 * c3 + b1 * c2 * d3 + c1 * d2 * b3 - c1 * b2 * d3 - b1 * d2 * c3 - d1 * c2 * b3;
//        double delta2 = a1 * d2 * c3 + d1 * c2 * a3 + c1 * a2 * d3 - c1 * d2 * a3 - d1 * a2 * c3 - a1 * c2 * d3;
//        double delta3 = a1 * b2 * d3 + b1 * d2 * a3 + d1 * a2 * b3 - d1 * b2 * a3 - b1 * a2 * d3 - a1 * d2 * b3;
//
//        if (delta != 0)
//        {
//            x = delta1 / delta;
//            y = delta2 / delta;
//            z = delta3 / delta;
//            System.out.println("x = {0}; y = {1}; z = {2}"+ x+ y+z);
//        }
//        else System.out.println("Ошибка. Определитель равен нулю.");














    }

}
