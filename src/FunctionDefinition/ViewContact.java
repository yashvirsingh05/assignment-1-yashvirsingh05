package FunctionDefinition;

import Linkedlist.LinkedListDefinitionClass;

public class ViewContact {
    public boolean viewList(LinkedListDefinitionClass person) {
        System.out.println("--------------Here are all your Contacts---------");
        int size = person.getSize();
        printContact(person, size);
        return true;
    }

}
