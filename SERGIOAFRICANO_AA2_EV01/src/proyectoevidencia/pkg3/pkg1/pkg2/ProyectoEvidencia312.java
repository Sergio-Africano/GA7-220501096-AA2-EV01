/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoevidencia.pkg3.pkg1.pkg2;

/**
 *
 * @author Janus
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ProyectoEvidencia312 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String usuario="root";
        String password="Root@2025!";
        String url="jdbc:mysql://localhost:3307/ranchoarepa";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProyectoEvidencia312.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            conexion=DriverManager.getConnection(url,usuario,password);
            statement=conexion.createStatement();
            rs=statement.executeQuery("SELECT * FROM USUARIOS");
            rs.next();
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("nombre"));
            }while (rs.next());
            
            //Insert
            statement.executeUpdate("INSERT INTO USUARIOS (id, nombre, correo, telefono) VALUES(6, 'Raul', 'beto@example.com', '3004567890')");
            System.out.println("");
            rs=statement.executeQuery("SELECT * FROM USUARIOS");
            rs.next();
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("nombre"));
            }while (rs.next());
            
            //Update
            statement.executeUpdate("UPDATE usuarios SET nombre='andres' WHERE id=3");
            System.out.println("");
            rs=statement.executeQuery("SELECT * FROM USUARIOS");
            rs.next();
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("nombre"));
            }while (rs.next());
            
            //Delete
            statement.executeUpdate("DELETE from usuarios WHERE id=3");
            System.out.println("");
            rs=statement.executeQuery("SELECT * FROM USUARIOS");
            rs.next();
            do{
                System.out.println(rs.getInt("id")+":"+ rs.getString("nombre"));
            }while (rs.next());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProyectoEvidencia312.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}













