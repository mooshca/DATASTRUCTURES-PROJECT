public class Profile {
    
    private String contactID;
    private String name;
    private String phoneNumber;

    public Profile()    {
        contactID = java.util.UUID.randomUUID().toString();
        name = "";
        phoneNumber = "";
    }

    public Profile(String contactID, String name, String phoneNumber) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void editProfile(String contactID, String name, String phoneNumber) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void displayProfile() {
        System.out.println("Contact ID: " + contactID);
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }


}