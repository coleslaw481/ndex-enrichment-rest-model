package org.ndexbio.enrichment.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author churas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Task {
    
    private String _id;
    private String _webUrl;
    
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getWebUrl() {
        return _webUrl;
    }

    public void setWebUrl(String _webUrl) {
        this._webUrl = _webUrl;
    }
}
