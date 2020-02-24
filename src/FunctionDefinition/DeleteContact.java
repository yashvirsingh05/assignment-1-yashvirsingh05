package FunctionDefinition;


import Linkedlist.LinkedListDefinitionClass;
import Person.Person;

import java.util.Scanner;

public class deleteContact {

    public void removeContactFormLIst(LinkedListDefinitionClass person) {
        Scanner tell = new Scanner(System.in);
        System.out.println("Here are all your contacts:");
        for (int i = 0; i < person.getSize(); i++) {
            Person person1 = (Person) person.dataAtIndex(i);
            System.out.println(i + 1 + ". " + person1.getFrsitName() + " " + person1.getLastName());
        }
