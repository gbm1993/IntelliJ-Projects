package com.teach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySql {


    private Connection con = null;

    public MySql() throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/data", "root", "arsh985");

    }

    public void deleteFromStudent(Employee e) throws SQLException {
        PreparedStatement pt = con.prepareStatement("selec");

        pt.setString(1, "gaus");

        int i = pt.executeUpdate();
        System.out.println("record deleted :" + i);
    }
}
