package com.dagaz.yvgeny.financehelper.core.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by yvgeny on 03/06/16.
 */
public class SQLiteConnection {

    private static Connection con;

    public static Connection getConnection(){
        try {
            Class.forName("org.sqlite.JDBC").newInstance();// можно эту строчку удалить - драйвер автоматически будет найден

            // создание подключение к базе данных по пути, указанному в урле
            String url = "jdbc:sqlite:c:\\data\\money.db";

            if (con==null) con = DriverManager.getConnection(url);

            return con;


        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex){
            Logger.getLogger(SQLiteConnection.class.getName()).log(Level.SEVERE, null, ex);



        }
        return null;
    }
}
