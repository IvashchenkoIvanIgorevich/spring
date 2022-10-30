package org.example;

import org.example.helloWorld.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();
        MessageProvider mp = ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(mp.getMessage());
    }
}