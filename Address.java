

public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zip;


    public Address() {
    
        streetAddress = "";
        city = "";
        zip = "";
        state = "";
    }


    public Address(String sAddress, String c, String s, String z) {
       
        this.city = c;
        this.state = s;
        this.zip = z;
        this.streetAddress = sAddress;
        
    }
    
    
   

    public void print() {
        
        System.out.println(streetAddress +", "+ city+" "+zip+" "+state);
    }
 

    @Override
    public String toString() {
        
        return "Address" + "streetAddress:" + streetAddress + ", city:" + city + ", state:" + state + ", zip:" + zip + '}';
    }

    


    public void setAddress(String sAddress, String c, String s, String z) {
       
        this.city = c;
        this.state = s;
        this.zip = z;
        this.streetAddress = sAddress;
    }
    
    
    

    public String getStreetAddress() {
     
        return streetAddress;
    }

    public String getCity() {
       
        return city;
    }

    public String getState() {
    
        return state;
    }

    public String getZip() {
     
        return zip;
    }
   

    public void copyAddress(Address otherAddress) {
      
         this.city = otherAddress.city;
        this.state = otherAddress.state;
        this.zip = otherAddress.zip;
        this.streetAddress = otherAddress.streetAddress;
    }
}
