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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessLargeDataset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        //Load file with salary
        try {
            java.io.File file = new java.io.File("Salary.txt");
            Scanner input = new Scanner(file);
        } catch (Exception e) {
            System.out.println("File with the name specified can't be found");
        }

    }

}
