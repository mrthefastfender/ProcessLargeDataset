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
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Organization {

    public ArrayList<Employee> employees;
    double averageSalary;
    DecimalFormat ft = new DecimalFormat("###,###.##");

    public Organization() {
    }

    public void readEmployees() throws FileNotFoundException {
        //Load file with salary
        employees = new ArrayList<>();

        java.io.File file = new java.io.File("Salary.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {

            String firstName = input.next();
            String lastName = input.next();
            String rank = input.next();
            double salary = input.nextDouble();

            employees.add(new Employee(firstName, lastName, salary, Rank.valueOf(rank)));
        }
        System.out.println();
        input.close();
    }

    public double getAverageSalary(Rank rank) {

        int count = 0;
        for (Employee employee : employees) {
            if (employee.getRank() == rank) {
                count++;
            }
        }
        averageSalary = getTotalSalary(rank) / count;
        return averageSalary;
    }

    public double getTotalSalary(Rank rank) {
        double totalSalary = 0;
        for (Employee e : employees) {
            if (e.getRank() == rank) {
                totalSalary +=e.getSalary();
            }
        }
        return totalSalary;
    }
    
    public String salaryTostring(Rank rank){
        String formattedTotal = ft.format(getTotalSalary(rank));
        String formattedAVG = ft.format(getAverageSalary(rank));
        System.out.println("\n");
        System.out.println("Total Salary  | Average Salary" + " " + rank);
        return formattedTotal + " " + "|" + " " + formattedAVG;
        
    }

}
