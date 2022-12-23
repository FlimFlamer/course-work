import java.util.Objects;

public class Employee {
    private int deportament;
    private int id;
    private String initials;
    private double salary;

    private static int counter = 0;



    public Employee (String initials, int deportament, double salary) {
        this.id = counter;
        this.initials = initials;
        this.deportament = deportament;
        this.salary = salary;
        counter +=1;
    }
    @Override
    public String toString() {
        return "ID: " + id + " Ф.И.О: " + initials + " Отдел: " + deportament + " Зарплата: " + salary;
    }


    public int getDeportament() {
        return deportament;
    }

    public int getId() {

        return id;
    }

    public String getInitials() {

        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setDeportament(int deportament) {

    this.deportament = deportament;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return deportament == employee.deportament && id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(initials, employee.initials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deportament, id, initials, salary);
    }
}

