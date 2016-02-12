/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import abc.Multiply;
/**
 *
 * @author musman.bscs13seecs
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() 
    {
        assertEquals(new int[][] {{2,2},{2,2}}, Multiply.strassen(new int [][] {{1,1},{1,1}},new int [][] {{1,1},{1,1}}));
        assertEquals(new double[][] {{2,2},{2,2}}, Multiply.iter(new double [][] {{1,1},{1,1}},new double [][] {{1,1},{1,1}}));

    }
}
