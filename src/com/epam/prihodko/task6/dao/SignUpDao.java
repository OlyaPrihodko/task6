package com.epam.prihodko.task6.dao;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class SignUpDao {
    private final static String ADMIN_LOGIN = "admin";
    private final static String ADMIN_PASS = "admin";
    public static boolean SignUp(String enterLogin, String enterPass){

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
            // preparedStatement.setString(3,enterPass);
            b= preparedStatement.execute();
            if(b!=true){
                String st = "insert into registr( reg_login, reg_password) values('"+enterLogin+"','"+enterPass+"')";
                preparedStatement=connection.prepareStatement(st);
                b= preparedStatement.execute();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return b;
    }
}
