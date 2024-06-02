package DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


import logica.Entrada;
import logica.Espectaculo;
import logica.Cliente;

public class EntradaDao extends Conexion{

    
    public void actualizar(Entrada entrada, Cliente cliente, Espectaculo espectaculo) {
        
        
    }

    
    public void crear(Entrada entrada, Cliente cliente, Espectaculo espectaculo) {
        String consultaSQL = "INSERT INTO entrada (codEspectaculo, dni, fila, columna, fechacompra, precio) VALUES (?, ?, ?, ?, ?, ?)";
        try(PreparedStatement statement = conexion.prepareStatement(consultaSQL)){
            statement.setString(1, espectaculo.getCodEspectaculo());
            statement.setString(2, cliente.getDni());
            statement.setInt(3, entrada.getFila());
            statement.setInt(4, entrada.getColumna());
            statement.setDate(5, Date.valueOf(entrada.getFechaCompra()));
            statement.setDouble(6,entrada.getPrecio());
            statement.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }

    
    public void eliminar(String id) {
        
        
    }

    
    public Entrada leerPorId(String id) {
        
        return null;
    }

    
    public List<Entrada> listarTodos() {
        
        return null;
    }
    
}
