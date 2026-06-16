/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.junit1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nico
 */
public class RechnerTest {
    Rechner rechner = new Rechner();
    
    public RechnerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of plus method, of class Rechner.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        double a = 1.0;
        double b = 1.0;
        double expResult = 2.0;
        double result = rechner.plus(a, b);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of minus method, of class Rechner.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        double a = 1.0;
        double b = 1.0;
        double expResult = 1.0;
        double result = rechner.minus(a, b);
        assertEquals(expResult, result, 0);
    }
}
