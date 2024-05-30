public class Espectaculo {
    private int codEspectaculo;
    private String nombreEspectaculo;
    private int numeroEntradas;// TODO funcionalidad para poder ver la totalidad de entradas disponibles
    private String genero;

    public Espectaculo(int codEspectaculo, String nombreEspectaculo, int numeroEntradas, String genero) {
        this.codEspectaculo = codEspectaculo;
        this.nombreEspectaculo = nombreEspectaculo;
        this.numeroEntradas = numeroEntradas;
        this.genero = genero;
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

    public int getNumeroEntradas() {
        return numeroEntradas;
    }

    public void setNumeroEntradas(int numeroEntradas) {
        this.numeroEntradas = numeroEntradas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
