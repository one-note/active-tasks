package org.example;

import java.text.MessageFormat;
import java.util.Locale;

public class MessageFormatter {


    public static void main(String[] args) {


        String pattern = "Hello, {0}! You have {1} new messages.";


        Object[] arguments = {"Ansu", 3};


        MessageFormat messageFormat = new MessageFormat(pattern);


        String formattedMessage = messageFormat.format(arguments);


        System.out.println(formattedMessage);


        String name = "Ansu";
        int age = 25;


        String formattedMessages = String.format("Hey %s  You are %d years old.", name, age);
        System.out.println(formattedMessages);

        String patterns = "Hello, {0}! You are {1} years old.";
        Object[] argss = {"Ansu", 30};


        String formattedMessagess = MessageFormat.format(pattern, argss);
        System.out.println(formattedMessagess);


    }


}
