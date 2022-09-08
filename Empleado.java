package empresa;

public class Empleado {

    private String nombre;
    private String apellido;
    private int anoDeNacimiento;
    private int mesDeNacimiento;
    private int diaDeNacimiento;
    private int edad;
    private int documentoDeIdentidad;
    private double salarioInicial;
    private double salarioActual;
    private int anoDeIngreso;
    private int mesDeIngreso;
    private int diaDeIngreso;
    private int antiguedadLaboral;

    public Empleado() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.anoDeNacimiento = 0;
        this.mesDeNacimiento = 0;
        this.diaDeNacimiento = 0;
        this.edad = 0;
        this.documentoDeIdentidad = 0;
        this.salarioInicial = 0;
        this.salarioActual = 0;
        this.anoDeIngreso = 0;
        this.mesDeIngreso = 0;
        this.diaDeIngreso = 0;
        this.antiguedadLaboral = 0;
    }

    public Empleado(String unNombre, String unApellido, int unAnoDeNacimiento, int unMesDeNacimiento, int unDiaDeNacimiento, int unaEdad, int unDocumentoDeIdentidad, double unSalarioInicial, double unSalarioActual, int unAnoDeIngreso, int unMesDeIngreso, int unDiaDeIngreso, int unaAntiguedadLaboral) {
        this.nombre = unNombre;
        this.apellido = unApellido;
        this.anoDeNacimiento = unAnoDeNacimiento;
        this.mesDeNacimiento = unMesDeNacimiento;
        this.diaDeNacimiento = unDiaDeNacimiento;
        this.edad = unaEdad;
        this.documentoDeIdentidad = unDocumentoDeIdentidad;
        this.salarioInicial = unSalarioInicial;
        this.salarioActual = unSalarioActual;
        this.anoDeIngreso = unAnoDeIngreso;
        this.mesDeIngreso = unMesDeIngreso;
        this.diaDeIngreso = unDiaDeIngreso;
        this.antiguedadLaboral = unaAntiguedadLaboral;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String unApellido) {
        this.apellido = unApellido;
    }

    public int getAnoDeNacimiento() {
        return this.anoDeNacimiento;
    }

    public void setAnoDeNacimiento(int unAnoDeNacimiento) {
        this.anoDeNacimiento = unAnoDeNacimiento;
    }

    public int getMesDeNacimiento() {
        return this.mesDeNacimiento;
    }

    public void setMesDeNacimiento(int unMesDeNacimiento) {
        this.mesDeNacimiento = unMesDeNacimiento;
    }

    public int getDiaDeNacimiento() {
        return this.diaDeNacimiento;
    }

    public void setDiaDeNacimiento(int unDiaDeNacimiento) {
        this.diaDeNacimiento = unDiaDeNacimiento;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }

    public int getDocumentoDeIdentidad() {
        return this.documentoDeIdentidad;
    }

    public void setDocumentoDeIdentidad(int unDocumentoDeIdentidad) {
        this.documentoDeIdentidad = unDocumentoDeIdentidad;
    }

    public double getSalarioInicial() {
        return this.salarioInicial;
    }

    public void setSalarioInicial(double unSalarioInicial) {
        this.salarioInicial = unSalarioInicial;
    }

    public double getSalarioActual() {
        return this.salarioActual;
    }

    public void setSalarioActual(double unSalarioActual) {
        this.salarioActual = unSalarioActual;
    }

    public int getAnoDeIngreso() {
        return this.anoDeIngreso;
    }

    public void setAnoDeIngreso(int unAnoDeIngreso) {
        this.anoDeIngreso = unAnoDeIngreso;
    }

    public int getMesDeIngreso() {
        return this.mesDeIngreso;
    }

    public void setMesDeIngreso(int unMesDeIngreso) {
        this.mesDeIngreso = unMesDeIngreso;
    }

    public int getDiaDeIngreso() {
        return this.diaDeIngreso;
    }

    public void setDiaDeIngreso(int unDiaDeIngreso) {
        this.diaDeIngreso = unDiaDeIngreso;
    }

    public int getAntiguedadLaboral() {
        return this.antiguedadLaboral;
    }

    public void setAntiguedadLaboral(int unaAntiguedadLaboral) {
        this.antiguedadLaboral = unaAntiguedadLaboral;
    }

    @Override
    public String toString() {
        return this.getApellido() + ", " + this.getNombre() + " | " + this.getDiaDeNacimiento() + "/" + this.getMesDeNacimiento() + "/" + this.getAnoDeNacimiento() + " | " + this.getDocumentoDeIdentidad() + " | $" + this.getSalarioInicial() + " | " + this.getDiaDeIngreso() + "/" + this.getMesDeIngreso() + "/" + this.getAnoDeIngreso() + " | " + this.getEdad() + " | " + this.getAntiguedadLaboral() + " | $" + this.getSalarioActual();
    }
}
