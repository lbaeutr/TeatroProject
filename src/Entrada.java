import java.time.LocalDate;

public class Entrada {
    
    private int codEntrada;
    private Cliente cliente;
    private Espectaculo espectaculo;
    private int fila, columna;
    private LocalDate fechaCompra;
    private double precio;
    
    public Entrada(int codEntrada, Cliente cliente, Espectaculo espectaculo, int fila, int columna,
            LocalDate fechaCompra, double precio) {
        this.codEntrada = codEntrada;
        this.cliente = cliente;
        this.espectaculo = espectaculo;
        this.fila = fila;
        this.columna = columna;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }
    public int getCodEntrada() {
        return codEntrada;
    }
    public void setCodEntrada(int codEntrada) {
        this.codEntrada = codEntrada;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Espectaculo getEspectaculo() {
        return espectaculo;
    }
    public void setEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }
    public int getFila() {
        return fila;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public int getColumna() {
        return columna;
    }
    public void setColumna(int columna) {
        this.columna = columna;
    }
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
