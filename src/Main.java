public class Main {
    // БАЗОВАЯ СЛОЖНОСТЬ
    public static EmployeeBook book = new EmployeeBook();

    public static void main(String[] args) {
        book.addEmployee("Работник Первый", 1,30000);
        book.addEmployee("Работник Второй", 1,25000);
        book.addEmployee("Работник Третий", 2,27000);
        book.addEmployee("Работник Четвертый", 2,26000);
        book.addEmployee("Работник Пятый", 3,31000);
        book.addEmployee("Работник Шестой", 3,35000);
        book.addEmployee("Работник Седьмой", 4,40000);
        book.addEmployee("Работник Восьмой", 4,42000);
        book.addEmployee("Работник Девятый", 5,36000);
        book.addEmployee("Работник Десятый", 5,33000);

        book.separator();
        System.out.println("Список работников: ");
        book.separator();
        book.employeeString();
        book.separator();
        System.out.println("Сумма всех затрат: ");
        book.separator();
        book.sumSalary();
        book.separator();
        book.minSalaryEmployees();
        book.separator();
        book.maxSalaryEmployees();
        book.separator();
        book.averageSalary();
        book.separator();
        System.out.println("Ф.И.О всех сотрудников: ");
        book.separator();
        book.printInitialsEmployee();
        book.separator();
        book.salaryIndexation(0.03);
        book.separator();
        book.minDeportamentSalaryEmployees(4);
        book.separator();
        book.maxDeportamentSalaryEmployees(3);
        book.separator();
        book.averageDeportamentSalary(5);
        book.separator();
        book.salaryDeportamentIndexation(2, 0.03);
        book.separator();
        book.employeeDeportamentString(4);
        book.separator();
        book.salaryLessSpecified(35000);
        book.separator();
        book.salaryMoreGiven(35000);
        book.separator();
        book.addEmployee("ПЕРВЫЙ", 4, 10000);
        book.separator();
        book.removeEmployee("ПЕРВЫЙ");
        book.separator();
        book.changeSalaryEmployee("Работник третий", 55000);
        book.separator();
        book.changeDeportamentEmployee("Работник четвертый", 1);
        book.separator();
        book.allEmployeeSortDeportament();

    }
}
