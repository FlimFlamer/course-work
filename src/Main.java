public class Main {
    public static EmployeeBook employeeBook = new EmployeeBook();

    public static void main(String[] args) {

        initialiseEmployees();

        System.out.println("Базовая сложность");
        System.out.println();

        // Вывод всех работников
        System.out.println("Вывод всех работников");
        employeeBook.printAllEmployees();
        System.out.println();

        // Подсчёт суммы зарплат
        System.out.println("Подсчёт суммы зарплат");
        System.out.println(employeeBook.calculateSalaryCostsPerMonth());
        System.out.println();

        // Поиск минимальной зарплаты
        System.out.println("Поиск минимальной зарплаты");
        System.out.println(employeeBook.findMinSalaryPerson());
        System.out.println();

        // Поиск максимальной зарплаты
        System.out.println("Поиск максимальной зарплаты");
        System.out.println(employeeBook.findMaxSalaryPerson());
        System.out.println();

        // Подсчёт средней зарплаты
        System.out.println("Подсчёт средней зарплаты");
        System.out.println(employeeBook.calculateAverageSalary());
        System.out.println();

        // Печать всех ФИО сотрудников
        System.out.println("Печать всех ФИО сотрудников");
        employeeBook.printAllFullname();
        System.out.println();

        // Индексация зарплат
        System.out.println("Индексация зарплат");
        employeeBook.indexSalary(10);
        System.out.println();

        // Поиск минимальной зарплаты по отделу
        System.out.println("Поиск минимальной зарплаты по отделу");
        System.out.println(employeeBook.findMinSalaryPersonByDep(2));
        System.out.println();

        // Поиск максимальной зарплаты по отделу
        System.out.println("Поиск максимальной зарплаты по отделу");
        System.out.println(employeeBook.findMaxSalaryPersonByDep(2));
        System.out.println();

        // Подсчёт суммы зарплат по отделу
        System.out.println("Подсчёт суммы зарплат по отделу");
        System.out.println(employeeBook.calculateSalaryCostsPerMonthByDep(2));
        System.out.println();

        // Подсчёт средней зарплаты по отделу
        System.out.println("Подсчёт средней зарплаты по отделу");
        System.out.println(employeeBook.calculateAverageSalaryByDep(2));
        System.out.println();

        // Индексация зарплат по отделу
        System.out.println("Индексация зарплат по отделу");
        employeeBook.indexSalaryByDep(10, 2);
        System.out.println();

        // Вывод всех работников по отделу
        System.out.println("Вывод всех работников по отделу");
        employeeBook.printAllEmployeesByDep(2);
        System.out.println();

        // Вывод всех работников, чья зарплата меньше n
        System.out.println("Вывод всех работников, чья зарплата меньше n");
        employeeBook.printAllEmployeesWithSalaryLessThan(20000);
        System.out.println();

        // Вывод всех работников, чья зарплата больше n
        System.out.println("Вывод всех работников, чья зарплата больше n");
        employeeBook.printAllEmployeesWithSalaryMoreThan(20000);
        System.out.println();

        // Удаление сотрудника
        System.out.println("Удаление сотрудника");
        employeeBook.removeEmployee(9);
        employeeBook.removeEmployee("Работник Десятый");
        System.out.println();

        // Изменение зарплаты сотрудника по ФИО
        System.out.println("Изменение зарплаты сотрудника по ФИО");
        employeeBook.setEmployeeSalaryByFullname("Работник Первый", 100000);
        System.out.println();

        // Изменение отдела сотрудника по ФИО
        System.out.println("Изменение отдела сотрудника по ФИО");
        employeeBook.setEmployeeDepartmentByFullname("Работник Первый", 3);
        System.out.println();

        // Вывод всех сотрудников отсортированный по отделам
        System.out.println("Вывод всех сотрудников отсортированный по отделам");
        employeeBook.printAllEmployeesSortByDep();
    }

    public static void initialiseEmployees(){
        employeeBook.addEmployee("Первый Работник", 1, 30000);
        employeeBook.addEmployee("Второй Работник", 1, 31000);
        employeeBook.addEmployee("Третий Работник", 2, 21000);
        employeeBook.addEmployee("Четвертый Работник", 2, 26000);
        employeeBook.addEmployee("Пятый Работник", 3, 41000);
        employeeBook.addEmployee("Шестрой Работник", 3, 40000);
        employeeBook.addEmployee("Седьмой Работник", 4, 15000);
        employeeBook.addEmployee("Восьмой Работник", 4, 19000);
        employeeBook.addEmployee("Девятый Работник", 5, 28000);
        employeeBook.addEmployee("Десятый Работник", 5, 29000);
    }

}