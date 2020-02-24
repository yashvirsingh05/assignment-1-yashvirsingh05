package execution;

import FunctionDefinition.AddContact;
import Linkedlist.LinkedListDefinitionClass;
import Person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedListDefinitionClass<Person> listContact = new LinkedListDefinitionClass<Person>();
        boolean turnoff = false;
        Scanner tell = new Scanner(System.in);
        int a = 0;
        System.out.println("Welcome to yashvir Contact list \uD83D\uDE01:");
        while (!turnoff) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int ch = tell.nextInt();
            switch (ch) {
                case 1:
                    AddContact add = new AddContact();
                    LinkedListDefinitionClass list = new LinkedListDefinitionClass();
                    list.add(add.addContact());
                    break;
                case 2:
                    View view = new View();
                    view.viewList(listContact);
                    break;

                case 3:
                    SeachContact search = new SeachContact();
                    search.seach(listContact);
                    break;
                case 4:
                    deleteContact delete = new deleteContact();
                    delete.removeContactFormLIst(listContact);
                    break;
                case 5:
                    turnoff = true;
                    break;
                default:
                    System.out.println("invalid choice please re-enter");
                    break;
            }
        }
    }
}
