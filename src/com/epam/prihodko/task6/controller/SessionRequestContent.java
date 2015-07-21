package com.epam.prihodko.task6.controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class SessionRequestContent {
    private HashMap<String, Object> requestAttributes;
    private HashMap<String, String[]> requestParameters;
    private HashMap<String, Object> sessionAttributes;
//метод извлечение инфы тз запроса
    public void extractValues(HttpServletRequest request){
//реализация
    }
    //метод добавления в запрос данных для передачи в jsp
    public void insertttributes(HttpServletRequest request){

    }
}
