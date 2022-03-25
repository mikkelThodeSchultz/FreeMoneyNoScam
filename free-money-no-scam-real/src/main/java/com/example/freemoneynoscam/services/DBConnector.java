package com.example.freemoneynoscam.services;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

    static Connection connection;

    public static Connection connectDB(){
        try {
            String url = "jdbc:mysql://localhost:3306/free_money";
            connection = DriverManager.getConnection(url, "root", "Nkf55wur");
            System.out.println("Der er forbindelse");
        } catch (Exception e){
            e.printStackTrace();
        } return connection;
    }

    public static void main(String[] args) {
    }

}
