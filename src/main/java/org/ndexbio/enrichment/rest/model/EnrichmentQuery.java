/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Represents an Enrichment Query
 * @author churas
 */
public class EnrichmentQuery {
    
    private SortedSet<String> _geneList;
    private SortedSet<String> _databaseList;

    public SortedSet<String> getGeneList() {
        return _geneList;
    }

    public void setGeneList(SortedSet<String> _geneList) {
    	if (_geneList != null && !_geneList.isEmpty()) {
	    	SortedSet<String> uppercased = new TreeSet<>();
	    	for (String gene : _geneList) {
	    		String newGene = gene.toUpperCase().trim();
	    		if (newGene.length() > 0) {
	    			uppercased.add(newGene);
	    		}
	    	}
	        this._geneList = uppercased;
    	}
    }

    public SortedSet<String> getDatabaseList() {
        return _databaseList;
    }

    public void setDatabaseList(SortedSet<String> _databaseList) {  
    	if (_databaseList != null &&!_databaseList.isEmpty()) {
    		SortedSet<String> lowercased = new TreeSet<>();
    		for (String database : _databaseList) {
    			String newDatabase = database.toLowerCase().trim();
    			if (newDatabase.length() > 0) {
    				lowercased.add(newDatabase);
    			}
    		}
        	this._databaseList = lowercased;
    	}
    }
    
    @Override
    public int hashCode() {
    	String thisString = this
    			.getDatabaseList()
    			.stream()
    			.collect(Collectors.joining(",")) 
    			+ ":" 
    			+ this
    			.getGeneList()
    			.stream()
    			.collect(Collectors.joining(","));
        try {
			MessageDigest md = MessageDigest.getInstance("MD5");
	        byte[] messageDigest = md.digest(thisString.getBytes());
	        BigInteger no = new BigInteger(1, messageDigest);
	        return no.intValue();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		} 

    }
    
    @Override
    public boolean equals(Object o) {
    	//Check type
    	if (!(o instanceof EnrichmentQuery)) {
    		return false;
    	}
    	EnrichmentQuery eq = (EnrichmentQuery) o;
    	
    	//Compare contents
    	String thisString = this
    			.getDatabaseList()
    			.stream()
    			.collect(Collectors.joining(",")) 
    			+ ":" 
    			+ this
    			.getGeneList()
    			.stream()
    			.collect(Collectors.joining(","));
    	String oString = eq
    			.getDatabaseList()
    			.stream()
    			.collect(Collectors.joining(",")) 
    			+ ":" 
    			+ eq
    			.getGeneList()
    			.stream()
    			.collect(Collectors.joining(","));
    	return thisString.equalsIgnoreCase(oString);
    }
}
