package logica;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.ClienteDao;

public class App {
    public static void main(String[] args) throws Exception {
        List <Cliente> listaClientes = new ArrayList<>();
        ClienteDao dao = new ClienteDao();
        
        Cliente cliente = new Cliente();
        cliente.crearCliente();

        
    
}
}
    




