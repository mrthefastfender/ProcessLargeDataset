/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processlargedataset;

import java.io.FileNotFoundException;

/**
 *
 * @author spreng
 */
public class ProcessLargeDataset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        Organization o = new Organization();
        o.readEmployees();
        
        System.out.println(o.getAverageSalary(Rank.full));
        System.out.println(o.getTotalSalary(Rank.full));
           
        System.out.println(o.getAverageSalary(Rank.assistant));
        System.out.println(o.getTotalSalary(Rank.assistant));
           
        System.out.println(o.getAverageSalary(Rank.associate));
        System.out.println(o.getTotalSalary(Rank.associate));
        
        
        
    }

}
