package com.epam.prihodko.task6.dao.connection;

import java.util.ResourceBundle;

public class DBResourceManager {
    private final static DBResourceManager instance = new DBResourceManager();
    private ResourceBundle bundle = ResourceBundle.getBundle("com.epam.prihodko.task6/resources/db");
    public static DBResourceManager getInstance() {
        return instance;
    }
    public String getValue(String key){
        return bundle.getString(key);
    }

}
