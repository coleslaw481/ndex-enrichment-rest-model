/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;

import java.util.List;
import java.util.Map;

/**
 *
 * @author churas
 */
public class InternalDatabaseResults extends DatabaseResults {
    
    private Map<String, InternalNdexConnectionParams> _databaseConnectionMap;
    private List<InternalGeneMap> _geneMapList;
    private Map<String, Integer> _databaseUniqueGeneCount;
    private int _universeUniqueGeneCount;

    public Map<String, InternalNdexConnectionParams> getDatabaseConnectionMap() {
        return _databaseConnectionMap;
    }

    public void setDatabaseConnectionMap(Map<String, InternalNdexConnectionParams> _databaseConnectionMap) {
        this._databaseConnectionMap = _databaseConnectionMap;
    }

    public List<InternalGeneMap> getGeneMapList() {
        return _geneMapList;
    }

    public void setGeneMapList(List<InternalGeneMap> _geneMapList) {
        this._geneMapList = _geneMapList;
    }

    public Map<String, Integer> getDatabaseUniqueGeneCount() {
        return _databaseUniqueGeneCount;
    }

    public void setDatabaseUniqueGeneCount(Map<String, Integer> _databaseUniqueGeneCount) {
        this._databaseUniqueGeneCount = _databaseUniqueGeneCount;
    }

    public int getUniverseUniqueGeneCount() {
        return _universeUniqueGeneCount;
    }

    public void setUniverseUniqueGeneCount(int _universeUniqueGeneCount) {
        this._universeUniqueGeneCount = _universeUniqueGeneCount;
    }

    
    
    
}
