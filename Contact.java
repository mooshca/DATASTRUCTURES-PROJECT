public class Contact {
    private String contactID;
    private String name;
    private String phoneNumber;

    public Contact() {
        contactID = java.util.UUID.randomUUID().toString();
        name = "";
        phoneNumber = "";
    }
    
    public Contact(String contactID, String name, String phoneNumber) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void editContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void getRecentChats() {
        //Get 3 recent chats
    }
}