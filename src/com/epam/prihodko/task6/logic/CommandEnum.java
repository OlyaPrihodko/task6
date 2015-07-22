package com.epam.prihodko.task6.logic;

import com.epam.prihodko.task6.logic.impl.LoginCommand;
import com.epam.prihodko.task6.logic.impl.LogoutCommand;
import com.epam.prihodko.task6.logic.impl.SignUpCommand;

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

    },
    SIGNUP{
        {
            this.command = new SignUpCommand();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand(){
        return command;
    }
}
