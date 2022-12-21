public class Main {
    // БАЗОВАЯ СЛОЖНОСТЬ
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Работник Первый", 1, 35000);
        employees[1] = new Employee("Работник Второй", 1, 32000);
        employees[2] = new Employee("Работник Третий", 2, 34000);
        employees[3] = new Employee("Работник Четвертый", 2, 37000);
        employees[4] = new Employee("Работник Пятый", 3, 40000);
        employees[5] = new Employee("Работник Шестой", 3, 20000);
        employees[6] = new Employee("Работник Седьмой", 4, 31000);
        employees[7] = new Employee("Работник Восьмой", 4, 33000);
        employees[8] = new Employee("Работник Девятый", 5, 39000);
        employees[9] = new Employee("Работник Десятый", 5, 39000);

        separator();
        System.out.println("Список работников: ");
        separator();
        employeeString();
        separator();
        System.out.println("Сумма всех затрат: ");
        separator();
        sumSalary();
        separator();
        minSalaryEmployees();
        separator();
        maxSalaryEmployees();
        separator();
        averageSalary();
        separator();
        System.out.println("Ф.И.О всех сотрудников: ");
        separator();
        initialsEmployee();
    }

    //ВЫВОД ВСЕХ СОТРУДНИКОВ
    public static void employeeString() {
        for (Employee element : employees) {
            System.out.println(element);
        }
    }

    //СУММА ВСЕХ ЗАТРАТ
    public static void sumSalary() {

        double salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum = salarySum + employees[i].getSalary();
        }
        System.out.println(salarySum + " рублей.");
    }

    //СОТРУДНИК С МИНИМАЛЬНОЙ ЗП
    public static void minSalaryEmployees() {
        String minEmployee = null;
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (minSalary >= employees[i].getSalary()) {
                minEmployee = employees[i].getInitials();
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary + " " + minEmployee);
    }

    //СОТРУДНИК С МАКСИМАЛЬНОЙ ЗП
    public static void maxSalaryEmployees() {
        String maxEmployee = null;
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary <= employees[i].getSalary()) {
                maxEmployee = employees[i].getInitials();
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + maxSalary + " " + maxEmployee);
    }

    //СРЕДНЕЕ ЗНАЧЕНИЕ ЗП
    public static void averageSalary() {

        double salaryAverage = 0;
        if (employees.length > 0) {
            double sum = 0;
            for (int i = 0; i < employees.length; i++) {
                sum += employees[i].getSalary();
            }
            salaryAverage = sum / employees.length;
        }
        System.out.println("Средняя сумма всех затрат: " + salaryAverage);
    }

    //ФИО ВСЕХ СОТРУДНИКОВ
    public static void initialsEmployee() {
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getInitials());
    }

    //РАЗДЕЛИТЕЛЬ
    public static void separator() {
        System.out.println("******************");
    }
}
