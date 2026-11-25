/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.*;
import java.util.ArrayList;

import Model.Employee;
import Model.Department;

public class FileHandler {

    private static final String EMPLOYEE_FILE = "employees.dat";
    private static final String DEPARTMENT_FILE = "departments.dat";

    // Save Employees
    public static void saveEmployees(ArrayList<Employee> employees) {

        try (ObjectOutputStream output
                = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_FILE))) {

            output.writeObject(employees);

        } catch (IOException e) {
            System.out.println("Error saving employees: " + e.getMessage());
        }
    }
    
    // Load Employees
    @SuppressWarnings("unchecked")
    public static ArrayList<Employee> loadEmployees() {

        File file = new File(EMPLOYEE_FILE);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream input =
                new ObjectInputStream(new FileInputStream(EMPLOYEE_FILE))) {

            return (ArrayList<Employee>) input.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading employees: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Save Departments
    public static void saveDepartments(ArrayList<Department> departments) {

        try (ObjectOutputStream output =
                new ObjectOutputStream(new FileOutputStream(DEPARTMENT_FILE))) {

            output.writeObject(departments);

        } catch (IOException e) {
            System.out.println("Error saving departments: " + e.getMessage());
        }
    }

    // Load Departments
    @SuppressWarnings("unchecked")
    public static ArrayList<Department> loadDepartments() {

        File file = new File(DEPARTMENT_FILE);

        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream input =
                new ObjectInputStream(new FileInputStream(DEPARTMENT_FILE))) {

            return (ArrayList<Department>) input.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading departments: " + e.getMessage());
            return new ArrayList<>();
        }
    }

}
