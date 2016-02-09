/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processlargedataset;

/**
 *
 * @author spreng
 */
public class Employee {

    String firstName;
    String lastName;
    Rank rank;
    double salary;

     
    
    public Employee(String firstName, String lastName, double salary, Rank rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", rank=" + rank + ", salary=" + salary + '}';
    }
    
    

}
