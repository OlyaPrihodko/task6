package com.epam.prihodko.task6.logic.impl;

import com.epam.prihodko.task6.controller.JSPPageName;
import com.epam.prihodko.task6.controller.RequestParameterName;
import com.epam.prihodko.task6.dao.LoginDao;
import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.manager.ConfigurationManager;
import com.epam.prihodko.task6.manager.MessageManager;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request){

        String page = null;
        String login = request.getParameter(RequestParameterName.PARAM_NAME_LOGIN);
        String pass = request.getParameter(RequestParameterName.PARAM_NAME_PASSWORD);

        if(LoginDao.checkLogin(login, pass)){
            request.setAttribute("user", login);
            page = ConfigurationManager.getProperty(JSPPageName.MAIN_PAGE);

        }else{
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty(JSPPageName.LOGIN_PAGE);
        }
        return page;
    }
}
