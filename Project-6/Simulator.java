import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Simulator {
    static Scanner scnr = new Scanner(System.in);
    public static void main(String[] args) {
        getInputFile();
    }

    public static void run(int stops, ArrayList<Customer> custList) {
        Train train = new Train(stops, custList);
        train.simulate();
        train.displayStops();
    }

    public static int getStopsFromUser() {
        int input = -1;
        while (true) {
            try {
                System.out.println("Enter number of stops the train has on its route (must be greater than 1):");
                input = scnr.nextInt();
                if (input < 1) {
                    System.out.println("Input must be greater than 1");
                    input = scnr.nextInt();
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a number greater than 1.");
            }


            return input;
        }
    }

    public static File getInputFile(){
        String defPath = "C:\\train\\customer-data.txt";
        File file;
        while(true){
            System.out.println("Enter absolute path for data file or for default (C:/train/customer-data.txt) press Enter:");
            String filePath = scnr.nextLine().trim();
            if(filePath.isEmpty()){
                filePath = defPath;
            }

            file = new File(filePath);
            if(!file.exists() && !file.isFile()){
                System.out.println("File not found, try again.");
            }
            else{
                break;
            }
        }

        return file;

    }

    public static ArrayList<Customer> checkFile(int stops, File file){

        return null;
    }
}
