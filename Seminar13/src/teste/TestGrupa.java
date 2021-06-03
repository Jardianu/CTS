package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

import static org.junit.Assert.*;

public class TestGrupa {
    //teste right ptr constructor
    @Test
    public void testConstructorNrGrupaCorect() {
        Grupa grupa = new Grupa(1081);
        assertEquals(1081, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorExistanceDinCorrect() {
        Grupa grupa = new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    public void testConstructorLimitaInferioara() {
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    public void testConstructorLimitaSuperioara() {
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptieLimitaInferioara() {
        Grupa grupa = new Grupa(998);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorExceptieLimitaSuperioara() {
        Grupa grupa = new Grupa(1200);
    }

    @Test(timeout = 500)
    public void testConstructorPerformanta() {
        Grupa grupa = new Grupa(1000);
    }

    //finalizare teste right ptr constr

    @Test
    public void testGetPromovabilitateRight() {
        Grupa grupa = new Grupa(1081);

        for(int i = 0; i < 10; i++) {
            Student student = new Student();
            student.adaugaNota(7);
            grupa.adaugaStudent(student);
        }

        for(int i = 0; i < 5; i++) {
            Student student = new Student();
            student.adaugaNota(3);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.66, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateLimitaInferioara() {
        Grupa grupa = new Grupa(1081);

        for(int i = 0; i < 5; i++) {
            Student student = new Student();
            student.adaugaNota(3);
            grupa.adaugaStudent(student);
        }

        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateLimitaSuperioara() {
        Grupa grupa = new Grupa(1081);

        for(int i = 0; i < 5; i++) {
            Student student = new Student();
            student.adaugaNota(10);
            grupa.adaugaStudent(student);
        }

        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetPromovabilitateErrorCondition() {
        Grupa grupa = new Grupa(1050);

        grupa.getPromovabilitate();
    }

    @Test
    public void testGetPromovabilitateCardinality1() {
        Grupa gr = new Grupa(1081);
        Student student = new Student();
        student.adaugaNota(6);
        gr.adaugaStudent(student);
        assertEquals(1, gr.getPromovabilitate(), 0.01);
    }

}