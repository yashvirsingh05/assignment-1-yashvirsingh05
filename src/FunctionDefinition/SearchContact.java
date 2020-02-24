package FunctionDefinition;

import Linkedlist.LinkedListDefinitionClass;
import Person.Person;

import java.util.Scanner;

public class SearchContact {
    public void seach(LinkedListDefinitionClass person) {
        View view = new View();
        Scanner tell = new Scanner(System.in);
        LinkedListDefinitionClass<Person> matchedContact = new LinkedListDefinitionClass();
        System.out.println("You could search for a contact from their first names:");
        String element = tell.nextLine();
        int match = 0;
        for (int i = 0; i < person.getSize(); i++) {
            Person person1 = (Person) person.dataAtIndex(i);
            if (element.equals(person1.getFrsitName())) {
                match++;
                matchedContact.add(person1);
            }
        }
    }
