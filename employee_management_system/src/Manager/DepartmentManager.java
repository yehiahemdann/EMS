/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import java.util.ArrayList;
import Model.Department;

public class DepartmentManager {

    private ArrayList<Department> departments;

    public DepartmentManager() {
        departments = new ArrayList<>();
    }

    // Check if Department ID is unique
    public boolean isIdUnique(int id) {
        for (Department department : departments) {
            if (department.getDepartmentID() == id) {
                return false;
            }
        }
        return true;
    }

    // Check if Department Name is unique
    public boolean isNameUnique(String name) {
        for (Department department : departments) {
            if (department.getDepartmentName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    // Add Department
    public boolean addDepartment(Department department) {
        if (department == null) {
            return false;
        }

        if (!isIdUnique(department.getDepartmentID())
                || !isNameUnique(department.getDepartmentName())) {
            return false;
        }

        departments.add(department);
        return true;
    }

    // Get All Departments
    public ArrayList<Department> getAllDepartments() {
        return new ArrayList<>(departments);
    }

    // Search Department By ID
    public Department searchById(int id) {
        for (Department department : departments) {
            if (department.getDepartmentID() == id) {
                return department;
            }
        }
        return null;
    }

    // Search Department By Name
    public Department searchByName(String name) {
        for (Department department : departments) {
            if (department.getDepartmentName().equalsIgnoreCase(name)) {
                return department;
            }
        }
        return null;
    }

    // Delete Department
    public boolean deleteDepartment(int id) {
        for (int i = 0; i < departments.size(); i++) {
            if (departments.get(i).getDepartmentID() == id) {
                departments.remove(i);
                return true;
            }
        }
        return false;
    }
}
