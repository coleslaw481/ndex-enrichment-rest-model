package org.ndexbio.enrichment.rest.model;

import java.util.ArrayList;
import java.util.TreeSet;

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
        TreeSet<String> dblist = new TreeSet<>();
        dblist.add("db");
        eq.setDatabaseList(dblist);
        
        TreeSet<String> genelist = new TreeSet<>();
        genelist.add("gene");
        eq.setGeneList(genelist);
        
        assertEquals("db", eq.getDatabaseList().first());
        assertEquals("GENE", eq.getGeneList().first());

    }
}
