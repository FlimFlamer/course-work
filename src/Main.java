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
        separator();
        salaryIndexation();
        separator();
        minDeportamentSalaryEmployees(4);
        separator();
        maxDeportamentSalaryEmployees(3);
        separator();
        averageDeportamentSalary(5);
        separator();
        salaryDeportamentIndexation(2);
        separator();
        employeeDeportamentString(4);
        separator();
        salaryLessSpecified(35000);
        separator();
        salaryMoreGiven(35000);
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

    ////ПОВЫШЕНАЯ СЛОЖНОСТЬ
    //ИНДЕКСАЦИЯ ЗАРПЛАТ
    public static void salaryIndexation() {
        double percent = 0.03;
        double totalSalary;
        for (int i = 0; i < employees.length; i++) {
            totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
            employees[i].setSalary(totalSalary);
            System.out.println(employees[i].getInitials() + " Зарплата проиндексированна до: " + totalSalary);
        }
    }

    ////ОТДЕЛЫ
    //СОТРУДНИК С МИНИМАЛЬНОЙ ЗП
    public static void minDeportamentSalaryEmployees(int deportament) {
        String minDeportamentEmployee = null;
        double minDeportamentSalary = employees[0].getSalary();
        int minDeportament = employees[0].getDeportament();
        for (int i = 0; i < employees.length; i++) {
            if (minDeportamentSalary >= employees[i].getSalary() && deportament == employees[i].getDeportament()) {
                minDeportamentEmployee = employees[i].getInitials();
                minDeportamentSalary = employees[i].getSalary();
                minDeportament = employees[i].getDeportament();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + minDeportament + ": " + minDeportamentSalary + " " + minDeportamentEmployee);
    }

    //СОТРУДНИК С МАКСИМАЛЬНОЙ ЗП
    public static void maxDeportamentSalaryEmployees(int deportament) {
        String maxDeportamentEmployee = null;
        double maxDeportamentSalary = employees[0].getSalary();
        int maxDeportament = employees[0].getDeportament();
        for (int i = 0; i < employees.length; i++) {
            if (maxDeportamentSalary <= employees[i].getSalary() && deportament == employees[i].getDeportament()) {
                maxDeportamentEmployee = employees[i].getInitials();
                maxDeportamentSalary = employees[i].getSalary();
                maxDeportament = employees[i].getDeportament();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + maxDeportament + ": " + maxDeportamentSalary + " " + maxDeportamentEmployee);
    }

    //СРЕДНЯЯ ЗП ОП ОТДЕЛУ
    public static void averageDeportamentSalary(int deportament) {
        double salaryDeportamentAverage = 0;
        int deportamentCounter = 0;
        if (employees.length > 0) {
            double sum = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDeportament() == deportament) {
                    sum += employees[i].getSalary();
                    deportamentCounter += 1;
                }
            }
            salaryDeportamentAverage = sum / deportamentCounter;
        }
        System.out.println("Средняя сумма всех затрат отдела: " + salaryDeportamentAverage);
    }

    //ИНДЕКСАЦИЯ ЗП ОТДЕЛА
    public static void salaryDeportamentIndexation(int deportament) {
        double percent = 0.03;
        double totalSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDeportament() == deportament) {
                totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                employees[i].setSalary(totalSalary);
                System.out.println(employees[i].getInitials() + " Зарплата проиндексированна до: " + totalSalary);
            }
        }
    }

    //ВСЕ СОТРУДНИКИ ОТДЕЛА
    public static void employeeDeportamentString(int deportament) {
        String employeeDeportament = null;
        int idDeportament = 0;
        double sallaryDeportament;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDeportament() == deportament) {
                employeeDeportament = employees[i].getInitials();
                idDeportament = employees[i].getId();
                sallaryDeportament = employees[i].getSalary();
            } else {
                continue;
            }
            System.out.println("ID: " + idDeportament + " Ф.И.О: " + employeeDeportament + " Зарплата: " + sallaryDeportament);
        }
    }

    //СОТРУДНИКИ С ЗАРПЛАТОЙ МЕНЕЕ
    public static void salaryLessSpecified(double salary) {
        int id = 0;
        String initials = null;
        double salaryOut = 0;
        for (int i = 0; i < employees.length; i++) {
            if (salary >= employees[i].getSalary()) {
                id = employees[i].getId();
                initials = employees[i].getInitials();
                salaryOut = employees[i].getSalary();
                System.out.println("ID :" + id + " Ф.И.О: " + initials + " Зарплата: " + salaryOut);
            }
        }
    }

    // СОТРУДНИКИ С ЗАРПЛАТОЙ БОЛЕЕ
    public static void salaryMoreGiven(double salary) {
        int id = 0;
        String initials = null;
        double salaryOut = 0;
        for (int i = 0; i < employees.length; i++) {
            if (salary >= employees[i].getSalary()) {
                id = employees[i].getId();
                initials = employees[i].getInitials();
                salaryOut = employees[i].getSalary();
                System.out.println("ID :" + id + " Ф.И.О: " + initials + " Зарплата: " + salaryOut);

            }
        }
    }

    //РАЗДЕЛИТЕЛЬ
    public static void separator() {
        System.out.println("******************");
    }
}
