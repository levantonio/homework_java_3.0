package homework3;

public class Worker extends Employee {

    public Worker(String name, String surname, int age, double salary) {
        super(name,
                surname,
                age,
                salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; %d Возраст; Среднемесячная з/п: %.2f (руб)", getName(), getSurname(), getAge(), salary);
    }
}
