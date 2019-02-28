package org.ndexbio.enrichment.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author churas
 */
public class TestDatabaseResult {
    
    @Test
    public void testGettersAndSetters(){
        DatabaseResult dr = new DatabaseResult();
        assertEquals(null, dr.getDescription());
        assertEquals(null, dr.getName());
        assertEquals(null, dr.getNumberOfNetworks());
        assertEquals(null, dr.getUuid());
        dr.setDescription("description");
        dr.setName("name");
        dr.setNumberOfNetworks("1");
        dr.setUuid("2");
        assertEquals("description", dr.getDescription());
        assertEquals("name", dr.getName());
        assertEquals("1", dr.getNumberOfNetworks());
        assertEquals("2", dr.getUuid());
    }
}
