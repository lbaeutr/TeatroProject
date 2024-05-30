import java.time.LocalDate;

public class Entrada {
    private Espectaculo espectaculo;
    private int codEntrada;
    private LocalDate fechaCompra;
    private LocalDate fechaFuncion;
    private double precio;

    public Entrada(Espectaculo espectaculo, int codEntrada, LocalDate fechaCompra, LocalDate fechaFuncion,
            double precio) {
        this.espectaculo = espectaculo;
        this.codEntrada = codEntrada;
        this.fechaCompra = fechaCompra;
        this.fechaFuncion = fechaFuncion;
        this.precio = precio;
    }

    
    public Entrada() {
    }


    public Espectaculo getEspectaculo() {
        return espectaculo;
    }

    public void setEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }

    public int getCodEntrada() {
        return codEntrada;
    }

    public void setCodEntrada(int codEntrada) {
        this.codEntrada = codEntrada;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDate getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(LocalDate fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
