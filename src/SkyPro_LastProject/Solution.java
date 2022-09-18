package SkyPro_LastProject;

public class Solution {
    public static void main(String[] args) {
            EmployeeBook employeeBook = new EmployeeBook();
            employeeBook.addEmployee("John Smith", 1, 45000);
            employeeBook.addEmployee("Mister Bin", 2, 145000);
            employeeBook.addEmployee("Valeryi Sutkin", 3, 130000);
            employeeBook.addEmployee("Aleksandr Belov", 4, 105000);
            employeeBook.addEmployee("Aleksandr Petrov", 5, 88000);
            employeeBook.addEmployee("Dmitri Guberniev", 2, 15000);
            employeeBook.addEmployee("Dmitri Debrov", 2, 188000);
            employeeBook.addEmployee("Maksim Marcinkevic", 3, 54000);
            employeeBook.addEmployee("Vladimir Putin", 5, 76000);
            employeeBook.addEmployee("Graf Montekristo", 1, 777000);

            employeeBook.showAllEmployee();
            employeeBook.showEmloyeeFromDepartment();



    }
}
