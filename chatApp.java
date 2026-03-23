import javax.swing.*;
public class chatApp {
    public static void main(String[] args) {
        JFrame landingFrame = new JFrame("Landing Page");

        landingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        landingFrame.setSize(400, 400);
        landingFrame.setVisible(true);

        JButton profileButton = new JButton("Profile");
        landingFrame.add (profileButton);
        profileButton.setSize (50, 50);
        profileButton.setBounds (10, 10, 100, 30);
        profileButton.addActionListener(e -> profile(landingFrame));

        JButton contactsButton = new JButton("Contacts");
        landingFrame.add (contactsButton);
        contactsButton.setBounds (10, 30, 100, 30);
        contactsButton.addActionListener(e -> contacts(landingFrame));

        JButton newButton = new JButton("New Chat");
        landingFrame.add (newButton);
        newButton.setBounds (10, 50, 100, 30);
        newButton.addActionListener(e -> newChat(landingFrame));

        JButton saveButton = new JButton("Save/Load");
        landingFrame.add (saveButton);
        saveButton.setBounds (10, 70, 100, 30);

        saveButton.addActionListener(e -> saveAndLoad(landingFrame));

        String chatList[] = {"Harry Styles, read, 15:50 18/03/2026", 
                            "Taylor Swift, unread, 12:00 18/03/2026", 
                            "Ariana Grande, read, 00:00 14/03/2026"};
        JList chats = new JList(chatList);

        landingFrame.add(chats);
        landingFrame.setLayout(null);
        chats.setBounds(10, 100, 350, 300);
    
    }

    public static void profile(JFrame landingFrame) {
        JFrame profileFrame = new JFrame("Profile");

        profileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        profileFrame.setSize(400, 400);
        profileFrame.setVisible(true);
        profileFrame.setLayout(null);

        JButton backButton = new JButton("Back");
        profileFrame.add(backButton);
        backButton.setBounds(10, 10, 100, 30);

        backButton.addActionListener(e -> {
            landingFrame.setVisible(true);
            profileFrame.dispose();
        });


        JLabel nameLabel = new JLabel("User ID:");
        profileFrame.add(nameLabel);
        nameLabel.setBounds(10, 30, 400, 30);

        JLabel statusLabel = new JLabel("Name:");
        profileFrame.add(statusLabel);
        statusLabel.setBounds(10, 50, 400, 30);

        JLabel number = new JLabel("Telephone Number:");
        profileFrame.add(number);
        number.setBounds(10, 70, 400, 30);

        JButton editButton = new JButton("Edit");
        profileFrame.add(editButton);
        editButton.setBounds(10, 90, 100, 30);
    }

    public static void contacts(JFrame landingFrame) {
        JFrame contactsFrame = new JFrame("Contacts");

        contactsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contactsFrame.setSize(400, 400);
        contactsFrame.setVisible(true);
        contactsFrame.setLayout(null);
        
        JButton backButton = new JButton("Back");
        contactsFrame.add(backButton);
        backButton.setBounds(10, 10, 100, 30);

        backButton.addActionListener(e -> {
            landingFrame.setVisible(true);
            contactsFrame.dispose();
        });

        String contactsArray[] = {"Harry Styles",
                            "Ariana Grande",
                            "Taylor Swift",
                            "Shawn Mendes",
                            "Benson Boone",
                            "Sabrina Carpenter",
                            "Olivia Rodrigo"};
        JList contacts = new JList(contactsArray);

        contactsFrame.add(contacts);
        contactsFrame.setLayout(null);
        contacts.setBounds(10, 40, 350, 300);

        JButton newContactButton = new JButton("New Contact");
        contactsFrame.add(newContactButton);
        newContactButton.setBounds(10, 350, 100, 30);
    }
    
    public static void newChat(JFrame landingFrame) {
        JFrame chatFrame = new JFrame("New Chat");

        chatFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatFrame.setSize(400, 400);
        chatFrame.setVisible(true);
        chatFrame.setLayout(null);

        JButton backButton = new JButton("Back");
        chatFrame.add(backButton);
        backButton.setBounds(10, 10, 100, 30);
        backButton.addActionListener(e -> {
            landingFrame.setVisible(true);
            chatFrame.dispose();
        });
        
        JButton replyButton = new JButton("Reply");
        chatFrame.add(replyButton);
        replyButton.setBounds(10, 100, 100, 30);

        JButton deleteButton = new JButton("Delete");
        chatFrame.add(deleteButton);
        deleteButton.setBounds(10, 120, 100, 30);
    }
    
    public static void saveAndLoad(JFrame landingFrame) {
        JFrame saveLoad = new JFrame("Save/Load");

        saveLoad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        saveLoad.setSize(400, 400);
        saveLoad.setVisible(true);
        saveLoad.setLayout(null);

        JButton backButton = new JButton("Back");
        saveLoad.add(backButton);
        backButton.setBounds(10, 10, 100, 30);
        backButton.addActionListener(e -> {
            landingFrame.setVisible(true);
            saveLoad.dispose();
        });

        JButton saveButton = new JButton("Save");
        saveLoad.add(saveButton);
        saveButton.setBounds(10, 30, 100, 30);
        
        JButton loadButton = new JButton("Load");
        saveLoad.add(loadButton);
        loadButton.setBounds(10, 50, 100, 30);
    }
}


    
