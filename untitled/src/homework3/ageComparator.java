package homework3;

import java.util.Comparator;

public class ageComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getAge(), o2.getAge());
    }
}
