/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package studentmanagement;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class StudentManagementAppTest {
    
    public StudentManagementAppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class StudentManagementApp.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        StudentManagementApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class StudentManagementApp.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        StudentManagementApp instance = new StudentManagementApp();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printReport method, of class StudentManagementApp.
     */
    @Test
    public void testPrintReport() {
        System.out.println("printReport");
        StudentManagementApp instance = new StudentManagementApp();
        instance.printReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStudent method, of class StudentManagementApp.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        String id = "";
        String name = "";
        String thesis = "";
        StudentManagementApp instance = new StudentManagementApp();
        boolean expResult = false;
        boolean result = instance.addStudent(id, name, thesis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recordGrade method, of class StudentManagementApp.
     */
    @Test
    public void testRecordGrade() {
        System.out.println("recordGrade");
        String id = "";
        double grade = 0.0;
        StudentManagementApp instance = new StudentManagementApp();
        boolean expResult = false;
        boolean result = instance.recordGrade(id, grade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentManagementApp.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        String id = "";
        StudentManagementApp instance = new StudentManagementApp();
        boolean expResult = false;
        boolean result = instance.deleteStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class StudentManagementApp.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        StudentManagementApp instance = new StudentManagementApp();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
