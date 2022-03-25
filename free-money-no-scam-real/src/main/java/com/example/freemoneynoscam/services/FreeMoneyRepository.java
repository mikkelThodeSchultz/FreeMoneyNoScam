package com.example.freemoneynoscam.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FreeMoneyRepository {

    public void insertEmailToDb(String email) {
        try {
            PreparedStatement statement = DBConnector.connectDB().prepareStatement("INSERT INTO email (`email`) VALUES (?);");
            statement.setString(1,email);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
