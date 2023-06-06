package homework3;

/*
   спроектировать класс фрилаесера
 */
public class Freelancer extends Worker {
    private int hoursWorked;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public Freelancer(String name, String surname, int age, double salary, int hoursWorked) {
        super(name, surname, age, salary);
        this.hoursWorked = hoursWorked;

    }

    @Override
    public double calculateSalary() {
        return (salary/10) * hoursWorked;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; %d Возраст; часовая ставка: %.2f (руб); отработано часов: %d", getName(), getSurname(), getAge(), salary/10, hoursWorked);
    }
}
