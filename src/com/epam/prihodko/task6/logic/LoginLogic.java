package com.epam.prihodko.task6.logic;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.FileNotFoundException;
import java.sql.*;

public class LoginLogic {
    private final static String ADMIN_LOGIN = "admin";
    private final static String ADMIN_PASS = "admin";
    public static boolean checkLogin(String enterLogin, String enterPass){
      //  return ADMIN_LOGIN.equals(enterLogin)&&ADMIN_PASS.equals(enterPass);
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        boolean b=false;
        String s="select * from registr where reg_login='"+enterLogin+"'&& reg_password='"+enterPass+"'";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb","root","root");//("jdbc:mysql://localhost:3306/hoteldb","root","root");
            preparedStatement=connection.prepareStatement(s);
           // preparedStatement.setString(2,enterLogin);
          //  preparedStatement.setString(3,enterPass);
            b= preparedStatement.execute();


        }catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return b;
    }
}
