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
import java.text.DecimalFormat;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessLargeDataset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        DecimalFormat ft = new DecimalFormat("###,###.##");

        double assistantTotal = 0;
        double associateTotal = 0;
        double fullTotal = 0;
        double allTotal;

        double assistantAverage;
        double associateAverage;
        double fullAverage;
        double allAverage;

        int assistant = 0;
        int associate = 0;
        int full = 0;
        int all;

        //Load file with salary
        try {
            java.io.File file = new java.io.File("Salary.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String rank = input.next();
                double salary = input.nextDouble();
                switch (rank) {
                    case "assistant":
                        assistant++;
                        assistantTotal += salary;
                        break;
                    case "full":
                        full++;
                        fullTotal += salary;
                        break;
                    case "associate":
                        associate++;
                        associateTotal += salary;
                    default:
                        System.out.println("error!");

                }

            }
            input.close();

            all = assistant + associate + full;
            allAverage = (assistantTotal + associateTotal + fullTotal) / all;

            assistantAverage = assistantTotal / assistant;
            fullAverage = fullTotal / full;
            associateAverage = associateTotal / associate;

            allTotal = fullTotal + associateTotal + assistantTotal;

            System.out.println(ft.format(assistantAverage) + " " + ft.format(assistantTotal) + " " + assistant + "\n");
            System.out.println(ft.format(associateAverage) + " " + ft.format(associateTotal) + " " + associate + "\n");
            System.out.println(ft.format(fullAverage) + " " + ft.format(fullTotal) + " " + full + "\n");
            System.out.println(ft.format(allAverage) + " " + ft.format(allTotal) + " " + all + "\n");

        } catch (FileNotFoundException e) {
            System.out.println("File with the name specified can't be found");
        }

    }

}
