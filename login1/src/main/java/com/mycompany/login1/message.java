/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login1;

/**
 *
 * @author Student
 */
public class message {

    // Attributes
    private int messageNumber;
    private String sender;
    private String recipient;
    private String messageText;

    // Constructor
    public message(int messageNumber, String sender, String recipient, String messageText) {

        this.messageNumber = messageNumber;
        this.sender = sender;
        this.recipient = recipient;
        this.messageText = messageText;
    }

    // Getters
    public int getMessageNumber() {
        return messageNumber;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessageText() {
        return messageText;
    }

    // Display message details
    public void displayMessage() {

        System.out.println("\n===== MESSAGE DETAILS =====");
        System.out.println("Message Number: " + messageNumber);
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + messageText);
    }
}

    private String messageID;
    private String sender;
    private String recipient;
    private String messageText;
    private String messageHash;

    public void setMessage(String messageID, String sender, String recipient,
                       String messageText, String messageHash) {
    this.messageID = messageID;
    this.sender = sender;
    this.recipient = recipient;
    this.messageText = messageText;
    this.messageHash = messageHash;
}

    public String getMessageID() {
        return messageID;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getMessageHash() {
        return messageHash;
    }

    @Override
    public String toString() {
        return "Message ID: " + messageID +
                "\nSender: " + sender +
                "\nRecipient: " + recipient +
                "\nMessage: " + messageText +
                "\nHash: " + messageHash +
                "\n-----------------------";
    }
