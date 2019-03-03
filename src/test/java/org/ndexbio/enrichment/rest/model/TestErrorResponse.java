/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.ndexbio.enrichment.rest.model.exceptions.EnrichmentException;
/**
 *
 * @author churas
 */
public class TestErrorResponse {
    
    @Test
    public void testConstructor(){
        ErrorResponse er = new ErrorResponse("hi", new EnrichmentException("yo"));
        assertEquals("hi", er.getMessage());
        assertEquals("yo", er.getDescription());
        assertEquals(Long.toString(Thread.currentThread().getId()), er.getThreadId());
        assertNull(er.getTimeStamp());
        assertTrue(er.getStackTrace().contains("testConstructor"));
    }
    
    @Test
    public void testAsJson(){
        ErrorResponse er = new ErrorResponse("hi", new EnrichmentException("yo"));
        String res = er.asJson();
        assertTrue(res.startsWith("{\"message\": \"hi\","));
        assertTrue(res.contains("\"description\": \"yo\","));
    }
}
