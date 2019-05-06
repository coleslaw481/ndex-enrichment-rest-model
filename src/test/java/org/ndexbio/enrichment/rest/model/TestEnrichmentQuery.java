package org.ndexbio.enrichment.rest.model;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author churas
 */
public class TestEnrichmentQuery {
    
    @Test
    public void testGettersAndSetters(){
        EnrichmentQuery eq = new EnrichmentQuery();
        assertEquals(null, eq.getDatabaseList());
        assertEquals(null, eq.getGeneList());
        ArrayList<String> dblist = new ArrayList<>();
        dblist.add("db");
        eq.setDatabaseList(dblist);
        
        ArrayList<String> genelist = new ArrayList<>();
        genelist.add("gene");
        eq.setGeneList(genelist);
        
        assertEquals("db", eq.getDatabaseList().get(0));
        assertEquals("gene", eq.getGeneList().get(0));

    }
}
