package co.com.ceiba.pruebabasicaappalumno;

public class Alumno {

    private String codigo;
    private String nombre;
    private double notaParcial;
    private double notaDefinitiva;

    public Alumno(String codigo, String nombre, double notaParcial, double notaDefinitiva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaParcial = notaParcial;
        this.notaDefinitiva = notaDefinitiva;
    }

    public double calcularPromedio(){
        return (notaDefinitiva + notaParcial) / 2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaDefinitiva() {
        return notaDefinitiva;
    }

    public void setNotaDefinitiva(double notaDefinitiva) {
        this.notaDefinitiva = notaDefinitiva;
    }
}
