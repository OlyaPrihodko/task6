package com.epam.prihodko.task6.logic;

import com.epam.prihodko.task6.logic.impl.LoginCommand;
import com.epam.prihodko.task6.logic.impl.LogoutCommand;

public enum CommandEnum {
    LOGIN{
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT{
        {
            this.command = new LogoutCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand(){
        return command;
    }
}
