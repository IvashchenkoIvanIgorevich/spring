package org.example;

import org.example.helloWorld.HelloWorldMessageProvider;
import org.example.helloWorld.MessageProvider;
import org.example.helloWorld.MessageRenderer;
import org.example.helloWorld.StandardOutMessageRenderer;

public class Main {
    public static void main(String[] args) {
        MessageProvider mp = new HelloWorldMessageProvider();
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(mp);
        mr.render();
    }
}