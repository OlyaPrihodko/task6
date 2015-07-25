package com.epam.prihodko.task6.controller;

import com.epam.prihodko.task6.logic.ActionCommand;
import com.epam.prihodko.task6.manager.ConfigurationManager;
import com.epam.prihodko.task6.manager.MessageManager;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        processRequest(request, response);
    }
    private void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String page = null;
        //request.getRequestDispatcher(JSPPageName.LOGIN_PAGE).forward(request,response);
        //request.getSession().setAttribute("local", request.getParameter("local"));
        ActionFactory client = new ActionFactory();
        ActionCommand command = client.defineCommand(request);
        page = command.execute(request);
        if(page!=null){


            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
            dispatcher.forward(request,response);
        }
        else{

            //request.getSession(true).setAttribute("local", request.getParameter("local"));
            page = ConfigurationManager.getProperty(JSPPageName.INDEX_PAGE);
            request.getSession().setAttribute("nullPage", MessageManager.getProperty("message.nullpage"));
            response.sendRedirect(request.getContextPath()+page);
        }
    }
}
