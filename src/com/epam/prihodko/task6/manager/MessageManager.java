package com.epam.prihodko.task6.manager;

import java.util.ResourceBundle;

public class MessageManager {
    private final static String message = "com.epam.prihodko.task6/resources/messages";
    private final static ResourceBundle resourceBundle = ResourceBundle.getBundle(message);
    private MessageManager(){}
    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}
