

import java.io.*;
import java.util.*;

public class Project3 {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        AddressBook addressBook = new AddressBook();
        String str;
        String str1;
        String str2;
        int choice;
        int loc;
        int month;

        loadAddressBook(addressBook);
        addressBook.printAt(0);

        showMenu();

        choice = console.nextInt();
        console.nextLine();

        while (choice != 9) {
            switch (choice) {
                case 1:
                    addressBook.sort();
                    addressBook.print();
                    break;
                case 2:
                    System.out.println("Enter Last Name");
                    String lname = console.next();
                    addressBook.printInfoOf(lname);
                    break;
                case 3:
                    System.out.println("Enter Status");
                    String status = console.next();
                    addressBook.printNamesWithStatus(status);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            showMenu();
            choice = console.nextInt();
            console.nextLine();
        }

    }

    public static void loadAddressBook(AddressBook adBook) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("AddressDataExample.txt"));

        String first;
        String last;

        int month;
        int day;
        int year;

        String street;
        String city;
        String state;
        String zip;

        String phone;
        String pStatus;

        ExtPerson temp;

        int i = 0;

        while (inFile.hasNext()) {
            
            String line = inFile.nextLine();
            first = line.split(" ")[0];
            last = line.split(" ")[1];

            String line2 = inFile.nextLine();
            month = Integer.parseInt(line2.split(" ")[0]);
            day = Integer.parseInt(line2.split(" ")[1]);
            year = Integer.parseInt(line2.split(" ")[2]);
            Date dob = new Date(month, day, year);

            street = inFile.nextLine();
            city = inFile.nextLine();;
            state = inFile.nextLine();;
            zip = inFile.nextLine();
            
            Address sd = new Address(street, city,state, zip);

            phone = inFile.nextLine();
            pStatus = inFile.nextLine();
            
            temp = new ExtPerson(sd, dob, pStatus, first, last);
            adBook.insertAt(temp, i);
            
            i++;
            
           
            
            
        }
    }

    public static void showMenu() {
        System.out.println("Welcome to the address book program.");
        System.out.println("Choose among the following options:");
        System.out.println("1: Print the information sorted by LastName");
        System.out.println("2: Print the information of a person");
        System.out.println("3: Print the names of persons having a particular status");
        System.out.println("9: Terminate the program");
    }
}
