package FunctionDefinition;

import Linkedlist.LinkedListDefinitionClass;
import Person.Person;

import java.util.Scanner;

public class AddContact {

    public Person addContact() {
        Person person = new Person();
        Scanner tell = new Scanner(System.in);
        System.out.println("You have chosen to add a new Contact: ");
        System.out.println("Please enter the Name of the Person: ");
        System.out.print("First Name : ");
        person.setFrsitName(tell.nextLine());
        System.out.print("Last Name : ");
        person.setLastName(tell.nextLine());
        LinkedListDefinitionClass<Long> contactNumber = new LinkedListDefinitionClass<Long>();
        boolean no = false;
        while (no != true) {
            System.out.print("Contact number: ");
            long contactNo = Long.parseLong(tell.nextLine());
            contactNumber.add(contactNo);
            System.out.print("Would you like to add another contact number? (y/n): ");
            char choise = (tell.nextLine()).charAt(0);
            if (choise != 'n') {

            } else
                no = true;
        }
        person.setContactNo(contactNumber);
        System.out.print("Would you like to add Email address ? (y/n): ");
        char choise = (tell.nextLine()).charAt(0);
        if (choise == 'y') {
            System.out.println("Enter the Email: ");
            person.setEmailAddress(tell.nextLine());
        }
        return person;
    }
}

