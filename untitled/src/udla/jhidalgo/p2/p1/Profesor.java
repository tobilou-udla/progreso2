package udla.jhidalgo.p2.p1;

public class Profesor extends Persona{
    private Materia materia;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad, String genero, Materia materia) {
        super(nombre, apellido, edad, genero);
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
