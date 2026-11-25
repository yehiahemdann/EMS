/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test;

import Model.Employee;
import Model.Department;
import Manager.EmployeeManager;
import Manager.DepartmentManager;

public class TestLoading {

    public static void main(String[] args) {

        // Create new managers
        EmployeeManager employeeManager = new EmployeeManager();
        DepartmentManager departmentManager = new DepartmentManager();

        // Load and display employees
        System.out.println("Loaded Employees:");

        for (Employee e : employeeManager.getAllEmployees()) {
            System.out.println(
                    e.getEmployeeID() + " - " +
                    e.getFullName() + " - " +
                    e.calculateSalary()
            );
        }

        // Load and display departments
        System.out.println("\nLoaded Departments:");

        for (Department d : departmentManager.getAllDepartments()) {
            System.out.println(
                    d.getDepartmentID() + " - " +
                    d.getDepartmentName()
            );
        }
    }
}

