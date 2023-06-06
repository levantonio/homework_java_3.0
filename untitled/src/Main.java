import homework3.Employee;
import homework3.Freelancer;
import homework3.Worker;
import homework3.ageComparator;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();

    int empl = 0;

    public static Employee generateEmploee(int empl) {
        String[] names = new String[]{"Аделина", "Одонис", "Икайо", "Укулина", "Злан", "Алевтина", "Лександр", "Дима",
                "Леша", "Костя", "Лина", "Иса", "Юлла", "Илсу", "Мольберт", "Ульбина", "Зульфия", "Эльфред", "Амалия"};

        String[] surnames = new String[]{"Эбашев", "Юбашин", "Башкин", "Аянцев", "Петрофф", "Иванофф", "Сидорофф", "Гераскина",
                "Коттов", "Песков", "Жарков", "Федоров", "Солнцефф", "Дакойчук", "Гир", "Джоли", "Абрашкин",
                "Абрикосов", "Яблоков"};
        int age = random.nextInt(20, 65);
        int salary = random.nextInt(20000, 80000);
        int hoursWorked = random.nextInt(0, 160);
        if (empl == 0) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], age, salary);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],age, salary, hoursWorked);
        }

    }


    public static void vorker() {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmploee(0);
        }
//        Arrays.sort(employees, new SalaryComparator());
        Arrays.sort(employees);
        for (Employee emploee : employees) {
            System.out.println(emploee);

        }
    }

    public static void frelancer () {
        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmploee(1);
        }
        Arrays.sort(employees, new ageComparator());

        for (Employee emploee : employees) {
            System.out.println(emploee);
        }
    }
    public static void main(String[] args) {
        vorker();
        System.out.println("----------//////////////////---------////////////-----------");
        frelancer();

    }
}