package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Interfaces.CRUD;
import logica.Cliente;

public class ClienteDao extends Conexion implements CRUD<Cliente>{

    @Override
    public void actualizar(Cliente cliente) {   //funciona
        conectar();
        String consultaSQL = "UPDATE Cliente SET nombre = ?, prApellido = ?, sgApellido = ? WHERE dni = ?";
        try(PreparedStatement statement = conexion.prepareStatement(consultaSQL)){
            statement.setString(1, cliente.getNombre());
            statement.setString(2,cliente.getPrApellido());
            statement.setString(3, cliente.getSgApellido());
            statement.setString(4, cliente.getDni());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        desconectar();
    }
            
            

    @Override
    public void crear(Cliente cliente) {    //funciona
        conectar();
        String consultaSQL = "INSERT INTO Cliente (dni, nombre, prApellido, sgApellido) VALUES (?, ?, ?, ?)";
        try(PreparedStatement statement = conexion.prepareStatement(consultaSQL)){
            statement.setString(1, cliente.getDni());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getPrApellido());
            statement.setString(4, cliente.getSgApellido());
            statement.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        desconectar();
    }

    @Override
    public void eliminar(String dni) {  //funciona
        int filasAfectadas;
        String consultaSQL ="DELETE FROM Cliente WHERE dni = ?";
        conectar();
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)){
            statement.setString(1, dni);
            filasAfectadas = statement.executeUpdate();
            if(filasAfectadas > 0){
                System.out.println("Cliente borrado");
            }else{
                System.out.println("No existe ningun cliente con ese dni");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        desconectar();
        
    }

    @Override
    public Cliente leerPorId(String dni) {  //funciona
        
        String consultaSQL = "SELECT * FROM Cliente WHERE dni = ?";
        String nombre;
        String prApellido;
        String sgApellido;
        
        Cliente clienteEncontrado = null;
        conectar();
        try (PreparedStatement statement = conexion.prepareStatement(consultaSQL)) {
            statement.setString(1, dni);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                nombre = resultSet.getString("nombre");
                prApellido= resultSet.getString("prApellido");
                sgApellido = resultSet.getString("sgApellido");
                
                clienteEncontrado = new Cliente(dni, nombre, prApellido, sgApellido);
            }else {
                System.out.println("Cliente no encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        desconectar();
        return clienteEncontrado;
    }

    @Override
    public List <Cliente> listarTodos() {  //funciona
        String dni;
        String nombre;
        String prApellido;
        String sgApellido;

        Cliente cliente = null;
        List <Cliente> listaClientes = new ArrayList();
        conectar();
        String consultaSQL = "SELECT * FROM Cliente";
        try(PreparedStatement statement = conexion.prepareStatement(consultaSQL)){
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                dni = resultSet.getString("dni");
                nombre = resultSet.getString("nombre");
                prApellido = resultSet.getString("prApellido");
                sgApellido = resultSet.getString("sgApellido");
                
                cliente = new Cliente (dni, nombre, prApellido, sgApellido);
                listaClientes.add(cliente);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        desconectar();
        return listaClientes;
        }
}
