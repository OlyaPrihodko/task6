package com.epam.prihodko.task6.logic.impl;

import com.epam.prihodko.task6.controller.JSPPageName;
import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements ActionCommand {
    @Override
    public String execute (HttpServletRequest request){
        String page = ConfigurationManager.getProperty(JSPPageName.INDEX_PAGE);
        request.getSession().invalidate();
        return page;
    }
}
