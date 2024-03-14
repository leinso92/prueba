/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author IO
 */
public class conexionMysql {
    Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/game_room","root","T3Amot4t4123.");
            System.out.println("CONECTADO");
        } catch (Exception e) {
            System.out.println("ERROR DE CONEXION A BD" + e);
        }
        return cn;
    }
}