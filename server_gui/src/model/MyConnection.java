/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author REYNARD
 */
public class MyConnection {
    Connection connect;
    Statement stat;
    ResultSet result;
    
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connect = DriverManager.getConnection("jdbc:mysql://localhost/ezbooking", "root", "");
        } catch (Exception e) {
            System.out.println("Error Get Connection : " + e);
        }
        return connect;
    }
}