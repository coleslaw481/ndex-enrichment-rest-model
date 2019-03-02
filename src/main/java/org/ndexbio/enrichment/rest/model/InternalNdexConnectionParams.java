/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;

/**
 *
 * @author churas
 */
public class InternalNdexConnectionParams {
    
    private String _user;
    private String _password;
    private String _server;

    public String getUser() {
        return _user;
    }

    public void setUser(String _user) {
        this._user = _user;
    }

    public String getPassword() {
        return _password;
    }

    public void setPassword(String _password) {
        this._password = _password;
    }

    public String getServer() {
        return _server;
    }

    public void setServer(String _server) {
        this._server = _server;
    }
    
    
}
