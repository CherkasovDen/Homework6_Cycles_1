//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Вывести число " + i);
        }
        //Task2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Вывести число " + i);
        }
        //Task3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Вывести число " + i);
        }
        //Task4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Вывести число " + i);
        }
        //Task5
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //Task6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        //Task7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        //Task8
        System.out.println("Задача 8");
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Task9
        System.out.println("Задача 9");
        int money1 = 29000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + money1;
            total1 = total1 + total1/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
        //Task10
        for (int i = 1; i <= 10; i++) {
            int c = 2 * i;
            System.out.println("2*" + i + "=" + c);
        }
    }
}
