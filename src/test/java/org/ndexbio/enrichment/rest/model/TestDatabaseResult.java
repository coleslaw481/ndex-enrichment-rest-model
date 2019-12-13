package org.ndexbio.enrichment.rest.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
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
        assertEquals(null, dr.getNetworks());
        assertEquals(null, dr.getUuid());
        assertEquals(null, dr.getImageURL());
        dr.setDescription("description");
        dr.setName("name");
        Network nw = new Network();
        nw.setName("network");
        List<Network> networkList = new ArrayList<>();
        networkList.add(nw);
        dr.setNetworks(networkList);
        dr.setUuid("2");
        dr.setImageURL("image");
        assertEquals("description", dr.getDescription());
        assertEquals("name", dr.getName());
        assertEquals("network", dr.getNetworks().get(0).getName());
        assertEquals("2", dr.getUuid());
        assertEquals("image", dr.getImageURL());
    }
}
