package udla.jhidalgo.p2.p1;

public class Alumno extends Persona{
    private double nota1;
    private double nota2;
    private double nota3;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, String genero, double nota1, double nota2, double nota3) {
        super(nombre, apellido, edad, genero);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
