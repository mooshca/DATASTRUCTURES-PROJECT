public class Message {
    private String messageID;
    private String chatID;
    private String contactID;
    private String content;
    private Boolean readStatus;
    private String timestamp;

    public Message() {
        this.messageID = java.util.UUID.randomUUID().toString();
        this.chatID = null;
        this.contactID = "";
        this.content = "";
        this.readStatus = false;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }

    public Message(String chatID, String contactID, String content) {
        this.messageID = java.util.UUID.randomUUID().toString();
        this.chatID = chatID;
        this.contactID = contactID;
        this.content = content;
        this.readStatus = false;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }

    public String getMessageID() {
        return messageID;
    }

    public String getChatID() {
        return chatID;
    }

    public String getContactID() {
        return contactID;
    }

    public String getContent() {
        return content;
    }

    public Boolean getReadStatus() {
        return readStatus;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String markAsRead() {
        this.readStatus = true;
        return "Message marked as read.";
    }

}