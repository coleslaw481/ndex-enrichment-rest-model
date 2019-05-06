package org.ndexbio.enrichment.rest.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author churas
 */
public class TestInternalDatabaseResults {
    
    @Test
    public void testGettersAndSetters(){
        InternalDatabaseResults idr = new InternalDatabaseResults();
        assertEquals(null, idr.getDatabaseConnectionMap());
        assertEquals(null, idr.getDatabaseUniqueGeneCount());
        assertEquals(null, idr.getGeneMapList());
        assertEquals(null, idr.getNetworksToExclude());
        assertEquals(null, idr.getResults());
        assertEquals(0, idr.getUniverseUniqueGeneCount());
        
        Map<String, InternalNdexConnectionParams> conMap = new HashMap<String, InternalNdexConnectionParams>();
        conMap.put("hi", new InternalNdexConnectionParams());
        idr.setDatabaseConnectionMap(conMap);
        Map<String, Integer> geneCount = new HashMap<String, Integer>();
        geneCount.put("key", 1);
        idr.setDatabaseUniqueGeneCount(geneCount);
       
        
        idr.setGeneMapList(new ArrayList<InternalGeneMap>());
        
        Set<String> exclude = new HashSet<>();
        exclude.add("exclude");
        idr.setNetworksToExclude(exclude);
        
        idr.setUniverseUniqueGeneCount(5);
        
        assertTrue(idr.getDatabaseConnectionMap().containsKey("hi"));
        assertTrue(idr.getDatabaseUniqueGeneCount().containsKey("key"));
        assertEquals(0, idr.getGeneMapList().size());
        assertTrue(idr.getNetworksToExclude().contains("exclude"));
        idr.setResults(new ArrayList<DatabaseResult>());
        assertEquals(0, idr.getResults().size());
        assertEquals(5, idr.getUniverseUniqueGeneCount());
    }
}
