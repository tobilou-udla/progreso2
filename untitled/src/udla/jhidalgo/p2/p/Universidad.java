package udla.jhidalgo.p2.p;

import udla.jhidalgo.p2.p1.Alumno;
import udla.jhidalgo.p2.p1.Genero;
import udla.jhidalgo.p2.p1.Materia;
import udla.jhidalgo.p2.p1.Profesor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Universidad {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Julius");
        alumno1.setApellido("Morenazo");
        Profesor profesor = new Profesor();
        profesor.setMateria(Materia.ESTADISTICA);
        alumno1.setGenero(Genero.MASCULINO);

    }
}