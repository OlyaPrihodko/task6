package com.epam.prihodko.task6.logic;

import com.epam.prihodko.task6.logic.impl.EmptyCommand;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    public ActionCommand defineCommand(HttpServletRequest request){
        ActionCommand current = new EmptyCommand();
        //извлечение имени команды из запроса
        String action = request.getParameter("command");
        if(action ==null||action.isEmpty()){
            //если команда не задана в текущем запросе
            return current;
        }
        //получение объекта
       // try{
            CommandEnum currentEnum =  CommandEnum.valueOf(action.toUpperCase());

            current = currentEnum.getCurrentCommand();

       /* }catch (IllegalAccessException e){
            request.setAttribute("wrongAction", action + MessageManager.getProperty("message.wriongaction"));
        }*/
        return current;
    }

}