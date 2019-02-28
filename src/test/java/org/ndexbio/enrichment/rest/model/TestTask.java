/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author churas
 */
public class TestTask {
    
    @Test
    public void testGettersAndSetters(){
        Task t = new Task();
        assertEquals(null, t.getId());
        t.setId("hi");
        assertEquals("hi", t.getId());        
    }
    
}
