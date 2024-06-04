package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection conexion;
    private final String url = "jdbc:mariadb://localhost:3306/teatro";
    private final String user = "root";
    private final String pass = "admin";

    public void conectar(){
        try{
            conexion = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void desconectar() {
    try {
        if (conexion != null){
            if (!conexion.isClosed()){
                conexion.close();
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }    
        
    }
}
