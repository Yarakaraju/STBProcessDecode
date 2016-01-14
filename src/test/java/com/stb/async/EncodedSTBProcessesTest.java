/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stb.async;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oracle
 */
public class EncodedSTBProcessesTest {
    
    public EncodedSTBProcessesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initiateProcess method, of class EncodedSTBProcesses.
     */
    @Test
    public void testInitiateProcess() {
        System.out.println("initiateProcess");
        int max = 0;
        int total_processes = 0;
        EncodedSTBProcesses instance = new EncodedSTBProcesses();
        List expResult = null;
        List result = instance.initiateProcess(total_processes, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of getProcList method, of class EncodedSTBProcesses.
     */
    @Test
    public void testGetProcList() {
        System.out.println("getProcList");
        EncodedSTBProcesses instance = new EncodedSTBProcesses();
        List expResult = null;
        List result = instance.getProcList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
