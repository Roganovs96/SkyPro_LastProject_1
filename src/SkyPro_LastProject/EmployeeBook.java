package SkyPro_LastProject;

public class EmployeeBook {
    private Employee[] employeeArr = new Employee[10];

    void addEmployee(String fullname, int department, int salary) {
        Employee employee = new Employee(fullname, department, salary);
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i] == null) {
                employeeArr[i] = employee;
                return;
            }
        }
    }

    void removeEmployee(String fullName) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getFullName().equals(fullName)) {
                employeeArr[i] = null;
            }
        }
    }

    void changeEmployeeInfo(String fullName, int salary, int department) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getFullName().equals(fullName)) {
                employeeArr[i].setSalary(salary);
                employeeArr[i].setDepartment(department);
            }
        }
    }

    void showEmloyeeFromDepartment() {
        for (int i = 1; i < 6; i++) {
            System.out.println("ОТДЕЛ НОМЕР" + i);
            for (int j = 0; j < employeeArr.length; j++) {
                if (employeeArr[j].getDepartment() == i) {
                    System.out.println(employeeArr[j].getFullName());
                }
            }
            System.out.println("_______________________");

        }
    }

    void showSalaryLess(Employee[] employeeArr, int salary) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getSalary() < salary) {
                System.out.println(employeeArr[i]);
            }

        }
    }

    void showSalaryMore(Employee[] employeeArr, int salary) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getSalary() >= salary) {
                System.out.println(employeeArr[i]);
            }

        }
    }

    void increaseSalary(Employee[] employeeArr, double percent) {
        for (int i = 0; i < employeeArr.length; i++) {
            employeeArr[i].setSalary((int) (employeeArr[i].getSalary() * (percent / 100 + 1)));

        }
    }

    void increaseSalary(Employee[] employeeArr, double percent, int department) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartment() == department)
                employeeArr[i].setSalary((int) (employeeArr[i].getSalary() * (percent / 100 + 1)));

        }
    }

    Employee showMinSalary(Employee[] employeeArr, int department) {
        int minSalary = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getSalary() < minSalary && employeeArr[i].getDepartment() == department) {
                minSalary = employeeArr[i].getSalary();
                index = i;
            }
        }
        return employeeArr[index];
    }


    void showAllEmployee() {
        for (int i = 0; i < employeeArr.length; i++) {
            System.out.println(employeeArr[i]);
        }
    }

    void showAllEmployee(Employee[] employeeArr, int department) {
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartment() == department)
                System.out.println("Employee{" +
                        "fullName='" + employeeArr[i].getFullName() + '\'' +
                        ", salary=" + employeeArr[i].getSalary() +
                        ", id=" + employeeArr[i].getId() +
                        '}');
        }
    }

    int showPayrollCosts(Employee[] employeeArr) {
        int sum = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            sum += employeeArr[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплату всем сотруднкам равна:");
        return sum;
    }

    int showPayrollCosts(Employee[] employeeArr, int department) {
        int sum = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartment() == department) sum += employeeArr[i].getSalary();
        }
        return sum;
    }

    Employee showMinSalary(Employee[] employeeArr) {
        int minSalary = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getSalary() < minSalary) {
                minSalary = employeeArr[i].getSalary();
                index = i;
            }
        }
        return employeeArr[index];
    }

    Employee showMaxSalary(Employee[] employeeArr) {
        int maxSalary = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getSalary() > maxSalary) {
                maxSalary = employeeArr[i].getSalary();
                index = i;
            }
        }
        return employeeArr[index];
    }

    Employee showMaxSalary(Employee[] employeeArr, int department) {
        int maxSalary = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getSalary() > maxSalary && employeeArr[i].getDepartment() == department) {
                maxSalary = employeeArr[i].getSalary();
                index = i;
            }
        }
        return employeeArr[index];
    }

    int showAvgSalary(Employee[] employeeArr) {
        return showPayrollCosts(employeeArr) / employeeArr.length;
    }

    int showAvgSalary(Employee[] employeeArr, int department) {
        int counterEmpl = 0;
        for (int i = 0; i < employeeArr.length; i++) {
            if (employeeArr[i].getDepartment() == department) counterEmpl++;
        }
        return showPayrollCosts(employeeArr, department) / counterEmpl;
    }

    void showAllFullName(Employee[] employeeArr) {
        for (int i = 0; i < employeeArr.length; i++) {
            System.out.println(employeeArr[i].getFullName());

        }
    }
}
