package com.epam.prihodko.task6.logic.impl;

import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.logic.LoginLogic;
import com.epam.prihodko.task6.manager.ConfigurationManager;
import com.epam.prihodko.task6.manager.MessageManager;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements ActionCommand {
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";
    @Override
    public String execute(HttpServletRequest request){
        String page = null;
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
        //проверка логина и пароля
        if(LoginLogic.checkLogin(login, pass)){
            request.setAttribute("user", login);
            //определение пуьт к main.jsp
            String p = ConfigurationManager.getProperty("path.page.main");
            page = ConfigurationManager.getProperty("path.page.main");

        }else{
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
}
