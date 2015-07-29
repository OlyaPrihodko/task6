package com.epam.prihodko.task6.dao;

import com.epam.prihodko.task6.dao.connection.ConnectionPool;
import com.epam.prihodko.task6.dao.connection.ConnectionPoolException;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.io.FileNotFoundException;
import java.sql.*;

public class LoginDao {
    public static boolean checkLogin(String enterLogin, String enterPass){
        Connection connection = null;
        PreparedStatement preparedStatement= null;
        boolean b=false;
        String s="select * from registr where reg_login='"+enterLogin+"'&& reg_password='"+enterPass+"'";
        try{
          ConnectionPool connectionPool=ConnectionPool.getInstance();
          connectionPool.initPoolData();
          preparedStatement=connectionPool.takeConnection().prepareStatement(s);
            b = preparedStatement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }catch (ConnectionPoolException e) {
            e.printStackTrace();
        }
        return b;
    }
}
