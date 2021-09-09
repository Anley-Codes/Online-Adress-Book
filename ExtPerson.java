
public class ExtPerson extends Person {

    private Address address;
    private Date dob;
    private String phoneNumber;
    private String personStatus;
 

    public ExtPerson() {

    }
   

    public ExtPerson(String fName, String lName, int month, int day, int year,
            String street, String c, String s, String z,
            String phone, String pStatus) {
        super(fName, lName);
        this.address = new Address(street, c, s, z);
        dob = new Date(month, day, year);
        this.personStatus = pStatus;
        this.phoneNumber = phone;
    }

    public ExtPerson(Address address, Date dob, String personStatus, String first, String last) {

        super(first, last);
        this.dob = dob;
        this.personStatus = personStatus;
    }

    //method to print address info and person's name inherent from class Person
    public void printAddress() {
        
        System.out.println(this.getFirstName()+" "+this.getLastName()+" "+this.address.toString());

    }
    //method to print person's info in current class and person's name inherent from class Person

    public void printInfo() {
        
        System.out.println(this.toString()+" "+this.getFirstName()+" "+this.getLastName());

    }
    //method to print person's info including name in class Person using setName() setDate() and setAddress()

    public void setInfo(String fName, String lName,
            int month, int day, int year,
            String street, String c, String s,
            String z, String phone, String pStatus) {

        this.setName(fName, lName);
        this.address = new Address(street, c, s, z);
        dob = new Date(month, day, year);
        this.personStatus = pStatus;
        this.phoneNumber = phone;
    }
    //method to copy two person's info

    public void copyExtPerson(ExtPerson otherExtP) {

        this.setName(otherExtP.getFirstName(), otherExtP.getLastName());
        this.address = new Address(otherExtP.getStreetAddress(), otherExtP.getCity(), otherExtP.getState(), otherExtP.getZip());
        dob = new Date(otherExtP.getMonth(), otherExtP.getDay(), otherExtP.getYear());
        this.personStatus = otherExtP.getStatus();
        this.phoneNumber = otherExtP.getPhoneNumber();

    }
    //method to used in search() method in class AddressBook to check whether the person's last name exists.
    //Postcondition: name match true, not match false

    public boolean isLastName(String lName) {

        if (this.getLastName().equals(lName)) {

            return true;
        }

        return false;

    }
    //return elements in this class

    public String getStatus() {

        return personStatus;
    }

    public String getPhoneNumber() {

        return phoneNumber;

    }
    //method to judge if the person's status exists
    //Postcondition: exists true, not exist false

    public boolean isStatus(String status) {
       

        if (personStatus.equals("")) {

            return false;
        }

        return true;
    }
    //methods to get elements in this class

    public int getMonth() {

        return dob.getMonth();

    }

    public int getDay() {

        return dob.getDay();

    }

    public int getYear() {

        return dob.getYear();
    }

    public String getStreetAddress() {

        return address.getStreetAddress();
    }

    public String getCity() {

        return address.getCity();
    }

    public String getState() {

        return address.getState();
    }

    public String getZip() {

        return address.getZip();
    }
}
