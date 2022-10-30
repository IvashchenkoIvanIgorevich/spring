package org.example.helloWorld;

public interface MessageRenderer {
    void render();
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider messageProvider);
}
