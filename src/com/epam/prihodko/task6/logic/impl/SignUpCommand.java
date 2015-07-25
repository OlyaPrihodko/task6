package com.epam.prihodko.task6.logic.impl;


import com.epam.prihodko.task6.controller.JSPPageName;
import com.epam.prihodko.task6.controller.RequestParameterName;
import com.epam.prihodko.task6.dao.SignUpDao;
import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.manager.ConfigurationManager;
import com.epam.prihodko.task6.manager.MessageManager;

import javax.servlet.http.HttpServletRequest;

public class SignUpCommand implements ActionCommand {
    public String execute (HttpServletRequest request){

        String page = null;
        String login = request.getParameter(RequestParameterName.PARAM_NAME_LOGIN);
        String pass = request.getParameter(RequestParameterName.PARAM_NAME_PASSWORD);
        //String page = ConfigurationManager.getProperty("path.page.main");
        //request.getSession().invalidate();
        if(SignUpDao.SignUp(login, pass)){
            request.setAttribute("user", login);
            //определение пуьт к main.jsp
            page = ConfigurationManager.getProperty(JSPPageName.MAIN_PAGE);

       }else{
           request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
           page = ConfigurationManager.getProperty(JSPPageName.LOGIN_PAGE);
       }
        return page;
    }
}
