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
public class ParallelExecutionProcessTest {
    
    public ParallelExecutionProcessTest() {
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
     * Test of initiateProcess method, of class ParallelExecutionProcess.
     */
    @Test
    public void testInitiateProcess() {
        System.out.println("initiateProcess");
        List processList =  new EncodedSTBProcesses().initiateProcess(10, 12);;
        ParallelExecutionProcess instance = new ParallelExecutionProcess();
        instance.initiateDecode(processList);
        fail("The test case is a failed.");
    }
    
}
