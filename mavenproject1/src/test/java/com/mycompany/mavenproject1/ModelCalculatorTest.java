/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 823156569
 */
public class ModelCalculatorTest {
    ModelCalculator calc = new ModelCalculator();
    
    @Test
    public void testSoma() {
        assertEquals(50, calc.soma(30, 20));
    }

    /**
     * Test of sub method, of class ModelCalculator.
     */
    @Test
    public void testSub() {
        assertEquals(10, calc.sub(20, 10));
        
    }

    /**
     * Test of multi method, of class ModelCalculator.
     */
    @Test
    public void testMulti() {
        assertEquals(100, calc.multi(10, 10));
        
    }

    /**
     * Test of div method, of class ModelCalculator.
     */
    @Test
    public void testDiv() {
        assertEquals(25, calc.div(125, 5));
    }
    
}
