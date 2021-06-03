package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testConstructorCuParametru() {
        String nume = "Costica";
        Student student = new Student(nume);

        assertEquals(nume, student.getNume());

        assertNotNull(student.getNote());

    }

    @Test
    public void testConstructorFaraParametru() {
        Student student = new Student();

        assertNotNull("Atributul note nu a fost initializat",student.getNote());

        assertNotNull("Atributul nume nu a fost initialziat", student.getNume());
    }

    @Test
    public void testAdaugaNota() {
        Student student = new Student();

        int nota = 5;
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));

    }

    @Test
    public void testAdaugaNotaDimensiuneNote() {
        Student student = new Student();

        student.adaugaNota(5);

        student.adaugaNota(8);

        assertEquals(2, student.getNote().size());
    }

    @Test
    public void testCalculeazaMedie() {
        Student student = new Student();

        student.adaugaNota(5);
        student.adaugaNota(8);

        assertEquals(6.5f, student.calculeazaMedie(), 0.1);

    }

    @Test
    public void testCalculeazaMedieCuONota() {
        Student student = new Student();
        student.adaugaNota(5);

        assertEquals(5, student.calculeazaMedie(), 0.1);
    }

    @Test
    public void testCalculeazaMedieFaraNote() {
        Student student = new Student();

        assertEquals(0, student.calculeazaMedie(), 0.1);
    }

    @Test
    public void testAreRestante() {
        Student student = new Student();

        student.adaugaNota(9);
        student.adaugaNota(3);

        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante() {
        Student student = new Student();

        student.adaugaNota(9);
        student.adaugaNota(5);

        assertFalse(student.areRestante());
    }

    //ptr versiunea junit3
    @Test
    public void testGetNotaIndexInvalidV3() {
        Student student = new Student();


        try {
            student.getNota(5);
            fail("nu trebuia sa ajunga aici. Metoda nu arunca exceptia indexoutofbounds");
        } catch (IndexOutOfBoundsException e) {
            // nu e nevoie sa punem nimic
        } catch (Exception e) {
            fail("nu trebuia sa ajunga aici. Metoda nu arunca exceptia indexoutofbounds");
        }
    }

    //ptr versiunea junit4
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaExceptieV4() {
        Student s = new Student();

        s.getNota(100);
    }

    //ptr versiunea junit5
    @Test
    public void testGetNotaExceptieV5() {
        Student s = new Student();
        //nu am junit5.....
        //assertThrows(IndexOutOfBoundsException.class, () -> {student.getNota(100)})
    }

}
