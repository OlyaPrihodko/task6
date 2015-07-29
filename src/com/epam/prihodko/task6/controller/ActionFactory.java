package com.epam.prihodko.task6.controller;

import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.logic.CommandEnum;
import com.epam.prihodko.task6.logic.impl.EmptyCommand;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request){

        ActionCommand current =null;
        String action = request.getParameter(RequestParameterName.COMMAND_NAME);
        if(action == null || action.isEmpty()){

            return current=new EmptyCommand();
        }
            CommandEnum currentEnum =  CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        return current;
    }
}
