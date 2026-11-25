/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.util.ArrayList;
import Model.Employee;

public class EmployeeManager {

    private ArrayList<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    // Check if Employee ID is unique
    public boolean isIdUnique(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == id) {
                return false;
            }
        }
        return true;
    }

    // Add Employee
    public boolean addEmployee(Employee employee) {
        if (employee == null || !isIdUnique(employee.getEmployeeID())) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    // Get All Employees
    public ArrayList<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

    // Search Employee By ID
    public Employee searchById(int id) {
        for (Employee employee : employees) {
            if (employee.getEmployeeID() == id) {
                return employee;
            }
        }
        return null;
    }

    //Search Employees By Department
    public ArrayList<Employee> searchByDepartment(String departmentName) {
        ArrayList<Employee> result = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getDepartment() != null && employee.getDepartment().getDepartmentName().equalsIgnoreCase(departmentName)) {
                result.add(employee);
            }
        }
        return result;
    }

    // Update Employee
    public boolean updateEmployee(int id, Employee updatedEmployee) {

        if (updatedEmployee == null) {
            return false;
        }

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i).getEmployeeID() == id) {

                int newID = updatedEmployee.getEmployeeID();

                if (newID != id && !isIdUnique(newID)) {
                    return false;
                }

                employees.set(i, updatedEmployee);

                return true;
            }
        }

        return false;
    }

    // Delete Employee
    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeID() == id) {
                employees.remove(i);
                return true;
            }
        }

        return false;
    }
}
