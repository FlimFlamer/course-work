public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int size;

    public EmployeeBook() {
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
    }


    //ВЫВОД ВСЕХ СОТРУДНИКОВ
    public void employeeString() {
        for (Employee element : employees) {
            System.out.println(element);
        }
    }

    //СУММА ВСЕХ ЗАТРАТ
    public void sumSalary() {

        double salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                salarySum = salarySum + employees[i].getSalary();
            }
            System.out.println(salarySum + " рублей.");
        }
    }

    //СОТРУДНИК С МИНИМАЛЬНОЙ ЗП
    public void minSalaryEmployees() {
        String minEmployee = null;
        double minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && minSalary >= employees[i].getSalary()) {
                minEmployee = employees[i].getInitials();
                minSalary = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary + " " + minEmployee);
    }

    //СОТРУДНИК С МАКСИМАЛЬНОЙ ЗП
    public void maxSalaryEmployees() {
        String maxEmployee = null;
        double maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && maxSalary <= employees[i].getSalary()) {
                maxEmployee = employees[i].getInitials();
                maxSalary = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + maxSalary + " " + maxEmployee);
    }

    //СРЕДНЕЕ ЗНАЧЕНИЕ ЗП
    public void averageSalary() {

        double salaryAverage = 0;
        if (employees.length > 0) {
            double sum = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null) {
                    sum += employees[i].getSalary();
                }
                salaryAverage = sum / employees.length;
            }
            System.out.println("Средняя сумма всех затрат: " + salaryAverage);
        }
    }

    //ФИО ВСЕХ СОТРУДНИКОВ
    public void initialsEmployee() {
        for (int i = 0; i < employees.length; i++)
            if (employees[i] != null) {
                System.out.println(employees[i].getInitials());
            }
    }

    ////ПОВЫШЕНАЯ СЛОЖНОСТЬ
    //ИНДЕКСАЦИЯ ЗАРПЛАТ
    public void salaryIndexation() {
        double percent = 0.03;
        double totalSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                employees[i].setSalary(totalSalary);
                System.out.println(employees[i].getInitials() + " Зарплата проиндексированна до: " + totalSalary);
            }
        }
    }

    ////ОТДЕЛЫ
    //СОТРУДНИК С МИНИМАЛЬНОЙ ЗП
    public void minDeportamentSalaryEmployees(int deportament) {
        String minDeportamentEmployee = null;
        double minDeportamentSalary = employees[0].getSalary();
        int minDeportament = employees[0].getDeportament();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && minDeportamentSalary >= employees[i].getSalary() && deportament == employees[i].getDeportament()) {
                minDeportamentEmployee = employees[i].getInitials();
                minDeportamentSalary = employees[i].getSalary();
                minDeportament = employees[i].getDeportament();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + minDeportament + ": " + minDeportamentSalary + " " + minDeportamentEmployee);
    }

    //СОТРУДНИК С МАКСИМАЛЬНОЙ ЗП
    public void maxDeportamentSalaryEmployees(int deportament) {
        String maxDeportamentEmployee = null;
        double maxDeportamentSalary = employees[0].getSalary();
        int maxDeportament = employees[0].getDeportament();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && maxDeportamentSalary <= employees[i].getSalary() && deportament == employees[i].getDeportament()) {
                maxDeportamentEmployee = employees[i].getInitials();
                maxDeportamentSalary = employees[i].getSalary();
                maxDeportament = employees[i].getDeportament();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в отделе " + maxDeportament + ": " + maxDeportamentSalary + " " + maxDeportamentEmployee);
    }

    //СРЕДНЯЯ ЗП ОП ОТДЕЛУ
    public void averageDeportamentSalary(int deportament) {
        double salaryDeportamentAverage = 0;
        int deportamentCounter = 0;
        if (employees.length > 0) {
            double sum = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null && employees[i].getDeportament() == deportament) {
                    sum += employees[i].getSalary();
                    deportamentCounter += 1;
                }
            }
            salaryDeportamentAverage = sum / deportamentCounter;
        }
        System.out.println("Средняя сумма всех затрат отдела: " + salaryDeportamentAverage);
    }

    //ИНДЕКСАЦИЯ ЗП ОТДЕЛА
    public void salaryDeportamentIndexation(int deportament) {
        double percent = 0.03;
        double totalSalary;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDeportament() == deportament) {
                totalSalary = employees[i].getSalary() + (employees[i].getSalary() * percent);
                employees[i].setSalary(totalSalary);
                System.out.println(employees[i].getInitials() + " Зарплата проиндексированна до: " + totalSalary);
            }
        }
    }

    //ВСЕ СОТРУДНИКИ ОТДЕЛА
    public void employeeDeportamentString(int deportament) {
        String employeeDeportament = null;
        int idDeportament = 0;
        double sallaryDeportament;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDeportament() == deportament) {
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
    public void salaryLessSpecified(double salary) {
        int id = 0;
        String initials = null;
        double salaryOut = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && salary >= employees[i].getSalary()) {
                id = employees[i].getId();
                initials = employees[i].getInitials();
                salaryOut = employees[i].getSalary();
                System.out.println("ID :" + id + " Ф.И.О: " + initials + " Зарплата: " + salaryOut);
            }
        }
    }

    // СОТРУДНИКИ С ЗАРПЛАТОЙ БОЛЕЕ
    public void salaryMoreGiven(double salary) {
        int id = 0;
        String initials = null;
        double salaryOut = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && salary >= employees[i].getSalary()) {
                id = employees[i].getId();
                initials = employees[i].getInitials();
                salaryOut = employees[i].getSalary();
                System.out.println("ID :" + id + " Ф.И.О: " + initials + " Зарплата: " + salaryOut);

            }
        }
    }

    //ДОБАВЛЕНИЕ НОВОГО СОТРУДНИКА
    public void addEmployee(String initials, int deportament, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("Нельзя добавить сотрудника, в книге нет места");
                return;
            }
        }
        Employee employee = new Employee(initials, deportament, salary);
        employees[size++] = employee;
        System.out.println("Сотрудник " + initials + " добавлен!");
    }

    // УДАЛЕНИЕ CОТРУДНИКА
    public void removeEmployee(String initials) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getInitials().equalsIgnoreCase(initials)) {
                System.out.println(employees[i].getInitials() + " удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
            System.out.println("Сотрудник не найден");
            break;
        }
    }

    //ИЗМЕНЕНИЕ ЗП СОТРУДНИКА
    public void changeSalaryEmployee(String initials, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getInitials().equalsIgnoreCase(initials)){
                employees[i].setSalary(salary);
                System.out.println("Зарплата работника " + initials + " изменена на: " + salary);
                return;
            }
        }
        System.out.println("Работник не найден!");
    }

    //ИЗМЕНЕНИЕ ОТДЕЛА СОТРУДНИКА
    public void changeDeportamentEmployee(String initials, int deportament) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getInitials().equalsIgnoreCase(initials)){
                employees[i].setDeportament(deportament);
                System.out.println("Отдел работника " + initials + " изменена на: " + deportament);
                return;
            }
        }
        System.out.println("Работник не найден!");
    }

    //ПОЛУЧИТЬ ВСЕХ СОТРУДНИКОВ ПО ОТДЕЛАМ
    public void allEmployeeSortDeportament() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел: " + i);
            for (int i1 = 0; i1 < employees.length; i1++) {
                if (employees[i] != null) {
                    if (employees[i1].getDeportament() == i) {
                        System.out.println(employees[i1].getInitials());
                    }
                }
            }
        }
    }
    //РАЗДЕЛИТЕЛЬ
    public void separator() {
        System.out.println("******************");
    }
}

