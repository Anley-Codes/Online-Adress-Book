

public class AddressBook {

    private ExtPerson[] list;

    private int length;


    public AddressBook() {
        length = 50;
        list = new ExtPerson[length];
      
    }


    public void print() {
    
        for (int x = 0; x < length; x++) {

            if (list[x] != null) {
                System.out.println(list[x].toString());
            }

        }
    }
  

    public void printInfoOf(String lName) {
      
        int x = search(lName);
        if (x >= 0) {
            System.out.println(list[x].toString());
        } else {

            System.out.println("Not Found");
        }

    }
   

    public void printNamesWithStatus(String status) {
     
        for (int x = 0; x < length; x++) {

            if (list[x] != null && list[x].getStatus().equals(status)) {

                System.out.println(list[x].toString());
            }

        }
    }
   

    public void printAt(int i) {
  
        if (i <= this.length && list[i] != null) {

            System.out.println(list[i].toString());

        }

    }

    public void insertAt(ExtPerson eP, int i) {
      
        if (i <= this.length) {

            list[i] = eP;

        }
    }


    public int search(String lName) {
      
        for (int x = 0; x < length; x++) {

            if (list[x] != null && list[x].getLastName().equals(lName)) {
                return x;
            }

        }
        return -1;
    }
   

    public void sort() {

        ExtPerson temp = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                break;
            }
            for (int j = i + 1; j < list.length; j++) {

                if (list[j] == null) {
                    break;
                }

                if (list[i].getLastName().compareTo(list[j].getLastName()) > 0) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

}
