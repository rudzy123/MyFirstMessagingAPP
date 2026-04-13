package com.example.rudym.firstmessagingapp_rm;

public class Message {
    private String text;
    private long timestamp;

    public Message() {
        // Required for Firebase deserialization
    }

    public Message(String text, long timestamp) {
        this.text = text;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
