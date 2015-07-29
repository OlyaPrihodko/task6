package com.epam.prihodko.task6.dao.connection;

public class ConnectionPoolException extends Exception {
    private static final long serialVersionUID = 1L;
    public ConnectionPoolException(String message, Exception e){
        super(message, e);
    }

}
