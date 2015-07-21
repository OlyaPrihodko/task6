package com.epam.prihodko.task6.logic.impl;

import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.manager.ConfigurationManager;

import javax.servlet.http.HttpServletRequest;

public class EmptyCommand implements ActionCommand {
    @Override
    public String execute(HttpServletRequest request){
        String page = ConfigurationManager.getProperty("path.page.login");
        return page;
    }

}
