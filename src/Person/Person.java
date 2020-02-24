package Person;

import Linkedlist.LinkedListDefinitionClass;

public class Person {
    private String frsitName;
    private String lastName;
    private LinkedListDefinitionClass<Long> contactNo;
    private String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public LinkedListDefinitionClass getContactNo() {
        return contactNo;
    }

    public void setContactNo(LinkedListDefinitionClass<Long> contactNo) {
        this.contactNo = contactNo;
    }


}
