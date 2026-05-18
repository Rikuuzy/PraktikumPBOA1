/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobject;

/**
 *
 * @author shand
 */
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {

        String name = person.getName();


        Connection con = DriverManager.getConnection(
            "jdbc:mysql://127.0.0.1:3306/pbo",
            "root",
            ""
        );

        String query = "INSERT INTO person(name) VALUES (?)";

        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);

        ps.executeUpdate();

        ps.close();
        con.close();

        System.out.println("Data berhasil disimpan: " + name);
    }
}