/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

public abstract class Employee implements Serializable{
    
    private int employeeID;
    private String fullName;
    private int age;
    private String position;
    private Department department;

    public Employee(int employeeID, String fullName, int age, String position, Department departement) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department departement) {
        this.department = department;
    }
    
    public abstract double calculateSalary();
    
}
