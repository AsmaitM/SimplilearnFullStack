package mainApp;

import file_Manager.Add_File;
import file_Manager.Delete_File;
import file_Manager.Display_File;
import file_Manager.Search_File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class LockedMeApp {
    public static void main(String args[]) throws IOException {
    try {
        boolean exit = false;
        Scanner readChoice = new Scanner(System.in);
        int optionChoosen = 0;

        do {
        	System.out.println("\r \n \t Welcome to Lockers Pvt. Ltd File Manager app designed  by Asmait  Habteghiorghis! \r\n" );
    		System.out.println(" \t \t Please select one of the menus below.  Press\r\n");
    		System.out.println("\t 1 \t to see the list of the files \r\n");
    		System.out.println("\t 2 \t to add a file to the application\r\n");
    		System.out.println("\t 3 \t to delete a file from the application\r\n");
    		System.out.println("\t 4 \t to search a file from the main directory\r\n");
    		System.out.println("\t 5 \t to exit the app");

            optionChoosen = readChoice.nextInt();
            
            switch (optionChoosen) {
                case 1:
                   
                   File file = new File("C:\\Users\\asmu2\\SimpliLearnWorkSpace\\final_Phase01_Project\\Myfiles");
                   String[] fileList = file.list();
                   System.out.println("The file names sorted in ascending order are as follows:\r\n");
                   for(String name:fileList){
                       System.out.println(name);}
                    break;
                    
                case 2:
                	System.out.println("Please enter the file Name to be added to the application");
                    Scanner readFNameToAdd = new Scanner(System.in);
                    String FileNameToAdd = readFNameToAdd.nextLine();
                    Add_File obj1=new Add_File();
                    obj1.addMyFiles("C:\\Users\\asmu2\\SimpliLearnWorkSpace\\final_Phase01_Project\\Myfiles",FileNameToAdd.trim());  
                    break;
                    
                case 3:
                    System.out.println("Please enter the file Name to be deleted from the application");
                    Scanner readFNameToDelete = new Scanner(System.in);
                    String FileNameToDelete = readFNameToDelete.nextLine();
                    Delete_File obj2 = new Delete_File();
                    obj2.deleteExistingFile("C:\\Users\\asmu2\\SimpliLearnWorkSpace\\final_Phase01_Project\\Myfiles", FileNameToDelete.trim()); 
                    break;
                    
                case 4:
                	 System.out.println("Please enter the file name that you are looking for");
                     Scanner readFileName = new Scanner(System.in);
                     String FileName = readFileName.nextLine();
                     Search_File obj3 = new  Search_File();
                     obj3.searchMyFile("C:\\Users\\asmu2\\SimpliLearnWorkSpace\\final_Phase01_Project\\Myfiles", FileName.trim()); 
                     break;                     
              
                case 5:
                    System.out.println("Thank you for your time with us. We hope to see you soon again! Bye");
                    exit = true;
                    break;
            }
        }
        while (!exit);

    }
    catch (Exception e){
        System.out.println("Wrong input. Please enter a valid number from 1 to 5");
    }

    }
}