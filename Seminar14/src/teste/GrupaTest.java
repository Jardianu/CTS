package teste;

import clase.Grupa;
import clase.IStudent;
import org.junit.Test;
import teste.mocks.DummyStudent;
import teste.mocks.FakeStudent;
import teste.mocks.StubStudent;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testAdaugaStudent() {
        IStudent student = new DummyStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitate() {
        IStudent student = new StubStudent();

        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateFakeStudent() {
        Grupa grupa = new Grupa(1081);
        for(int i = 0; i < 8; i++) {
            FakeStudent fakeStudent = new FakeStudent();
            fakeStudent.setAreRestante(false);
            grupa.adaugaStudent(fakeStudent);
        }

        for(int i = 0; i < 2; i++) {
            FakeStudent fakeStudent = new FakeStudent();
            fakeStudent.setAreRestante(true);
            grupa.adaugaStudent(fakeStudent);
        }

        assertEquals(0.8f, grupa.getPromovabilitate(), 0.015);
    }
}