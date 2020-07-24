package com.teach;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {

       Employee e = new Employee();

//       e.setName("Gous Mulla");
//       e.setEmail("gausmulla@gmail.com");
//       e.setNumber(12345);

//        System.out.println(e.toString());
        MySql m = new MySql();
        m.deleteFromStudent(e);


    }
}
