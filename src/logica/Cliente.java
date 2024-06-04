package logica;

import java.util.Scanner;

import DAO.ClienteDao;

public class Cliente {
    private String dni;
    private String nombre;
    private String prApellido;
    private String sgApellido;
    
    public Cliente(String dni, String nombre, String prApellido, String sgApellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.prApellido = prApellido;
        this.sgApellido = sgApellido;
    }

    public Cliente() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrApellido() {
        return prApellido;
    }

    public void setPrApellido(String prApellido) {
        this.prApellido = prApellido;
    }

    public String getSgApellido() {
        return sgApellido;
    }

    public void setSgApellido(String sgApellido) {
        this.sgApellido = sgApellido;
    }
    public Cliente crearCliente(){
        String dni;
        String nombre;
        String prApellido;
        String sgApellido;
        Cliente cliente = null;
        ClienteDao dao = new ClienteDao();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dni");
        dni = sc.nextLine();
        if(validarDni(dni)){
            cliente = dao.leerPorId(dni);
            if (cliente == null){
                System.out.println("Introduce nombre");
                nombre = sc.nextLine();
                System.out.println("Introduce primer apellido");
                prApellido = sc.nextLine();
                System.out.println("Introduce segundo apellido");
                sgApellido = sc.nextLine();

                cliente = new Cliente(dni, nombre, prApellido, sgApellido);
                dao.crear(cliente);
            }else{
                System.out.println("Cliente ya creado");
            }
        }else{
            System.out.println("Formato dni invalido");
        }
        sc.close();
        return cliente;
    }
    public static boolean validarDni(String dni){
        boolean resultado = false;
        if(dni.matches("\\d{8}[a-zA-Z]")){ //esto comprueba que el dni tenga formato correcto
        resultado = true;
        }
        return resultado;
    }
}
