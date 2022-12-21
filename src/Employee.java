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
}

