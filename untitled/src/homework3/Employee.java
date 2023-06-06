package homework3;

public abstract class Employee implements Comparable<Employee> {

    private String name;
    private String surname;
    protected double salary; // Ставка з/п
    private int age;

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public int getAge() {return age;}

    public double getSalary() {
        return salary;
    }

    /**
     * Расчет ежемесячной зарплаты
     *
     */
    public double calculateSalary(){
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }
}
