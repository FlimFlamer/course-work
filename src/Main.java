public class Main {
    // БАЗОВАЯ СЛОЖНОСТЬ
    public static EmployeeBook book = new EmployeeBook();

    public static void main(String[] args) {

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
        book.initialsEmployee();
        book.separator();
        book.salaryIndexation();
        book.separator();
        book.minDeportamentSalaryEmployees(4);
        book.separator();
        book.maxDeportamentSalaryEmployees(3);
        book.separator();
        book.averageDeportamentSalary(5);
        book.separator();
        book.salaryDeportamentIndexation(2);
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
