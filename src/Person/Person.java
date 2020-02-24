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

    public String getFrsitName() {
        return frsitName;
    }

    public void setFrsitName(String frsitName) {
        this.frsitName = frsitName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
