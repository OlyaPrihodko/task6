package com.epam.prihodko.task6.manager;

import java.util.ResourceBundle;

public class ConfigurationManager {
    private final static ResourceBundle resourceBundle=ResourceBundle.getBundle("com.epam.prihodko.task6/resources/config");
    private ConfigurationManager(){}
    public static String getProperty(String key){
        return resourceBundle.getString(key);
    }
}
