package logica;
import java.time.LocalDate;

public class Espectaculo {
    private int codEspectaculo;
    private String nombreEspectaculo;
    private String genero;
    private LocalDate fechaEspectaculo;
    private int numeroEntradas;
    
    public Espectaculo(int codEspectaculo, String nombreEspectaculo, String genero, LocalDate fechaEspectaculo,
            int numeroEntradas) {
        this.codEspectaculo = codEspectaculo;
        this.nombreEspectaculo = nombreEspectaculo;
        this.genero = genero;
        this.fechaEspectaculo = fechaEspectaculo;
        this.numeroEntradas = numeroEntradas;
    }
    
    public int getCodEspectaculo() {
        return codEspectaculo;
    }
    public void setCodEspectaculo(int codEspectaculo) {
        this.codEspectaculo = codEspectaculo;
    }
    public String getNombreEspectaculo() {
        return nombreEspectaculo;
    }
    public void setNombreEspectaculo(String nombreEspectaculo) {
        this.nombreEspectaculo = nombreEspectaculo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public LocalDate getFechaEspectaculo() {
        return fechaEspectaculo;
    }
    public void setFechaEspectaculo(LocalDate fechaEspectaculo) {
        this.fechaEspectaculo = fechaEspectaculo;
    }
    public int getNumeroEntradas() {
        return numeroEntradas;
    }
    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }


}
