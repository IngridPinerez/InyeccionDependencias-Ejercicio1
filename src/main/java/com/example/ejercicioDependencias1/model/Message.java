package com.example.ejercicioDependencias1.model;

public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String contact;

    public Message() {
    }

    public Message(String senderName, String receiverName, String message, String contact) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.message = message;
        this.contact = contact;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
