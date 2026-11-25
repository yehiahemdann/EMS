/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;

import Model.Department;
import Model.Employee;
import Model.FullTimeEmployee;
import Manager.DepartmentManager;
import Manager.EmployeeManager;

public class TestFileHandler {

    public static void main(String[] args) {

        // Create managers
        DepartmentManager departmentManager = new DepartmentManager();
        EmployeeManager employeeManager = new EmployeeManager();

        // Create a department
        Department department = new Department(1, "Engineering");

        boolean departmentAdded =
                departmentManager.addDepartment(department);

        System.out.println("Department added: " + departmentAdded);

        // Create a full-time employee
        Employee employee = new FullTimeEmployee(
                101,
                "Ahmed Mohamed",
                22,
                "Engineer",
                department,
                10000,
                2000
        );

        boolean employeeAdded =
                employeeManager.addEmployee(employee);

        System.out.println("Employee added: " + employeeAdded);

        // Display saved data
        System.out.println("\nEmployees:");
        for (Employee e : employeeManager.getAllEmployees()) {
            System.out.println(
                    e.getEmployeeID() + " - " +
                    e.getFullName() + " - " +
                    e.calculateSalary()
            );
        }

        System.out.println("\nDepartments:");
        for (Department d : departmentManager.getAllDepartments()) {
            System.out.println(
                    d.getDepartmentID() + " - " +
                    d.getDepartmentName()
            );
        }
    }
}

