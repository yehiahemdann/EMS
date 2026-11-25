/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public abstract class Employee {
    
    private int employeeID;
    private String fullName;
    private int age;
    private String position;
    private Department departement;

    public Employee(int employeeID, String fullName, int age, String position, Department departement) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.age = age;
        this.position = position;
        this.departement = departement;
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

    public Department getDepartement() {
        return departement;
    }

    public void setDepartement(Department departement) {
        this.departement = departement;
    }
    
    public abstract double calculateSalary();
    
}
