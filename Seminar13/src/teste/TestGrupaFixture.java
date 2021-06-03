package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class TestGrupaFixture {
    private Grupa grupa;

    @Before
    public void setup() {
        grupa = new Grupa(1091);

        for(int i = 0; i < 35; i++) {
            Student student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    public void testGetPromovabilitatePerformanta() {
        grupa.getPromovabilitate();
    }
}