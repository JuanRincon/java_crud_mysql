/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "Soroastro2";
    String bd = "bdescuela";
    String ip = "127.0.0.1";
    String puerto = "33062";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            //JOptionPane.showMessageDialog(null, "La conexión se ha realizado con éxito");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro al conectarse a la base de datos, erro: " + e.toString());
        }
        return conectar;
    }
}
