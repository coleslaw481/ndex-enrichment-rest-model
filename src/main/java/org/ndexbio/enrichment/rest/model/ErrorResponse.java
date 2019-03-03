/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ndexbio.enrichment.rest.model;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Encapsulates an error encountered by the server
 * @author churas
 */
public class ErrorResponse {
    
    private String _errorCode;
    private String _message;
    private String _description;
    private String _stackTrace;
    private String _threadId;
    private String _timeStamp;
    
    public ErrorResponse(final String message, Exception ex){
        _message = message;
        _description = ex.getMessage();
        StringBuilder stackTraceStr = new StringBuilder();
        for (StackTraceElement ste : ex.getStackTrace()){
            stackTraceStr.append(ste.getMethodName());
            stackTraceStr.append("(");
            stackTraceStr.append(ste.getFileName());
            stackTraceStr.append(":");
            stackTraceStr.append(Integer.toString(ste.getLineNumber()));
            stackTraceStr.append(")\n");
        }
        _stackTrace = stackTraceStr.toString();
        _threadId = Long.toString(Thread.currentThread().getId());
    }

    private String getValueAsJsonString(final String value){
        if (value == null){
            return "null";
        }
        return "\"" + value + "\"";
    }
    /**
     * Fallback implementation of json version of object
     * {"message":"hi",
     *  "stackTrace":"org.ndexbio.enri",
     *  "threadId":"1",
     *  "description":"well",
     *  "errorCode":null,
     *  "timeStamp":null}
     * @return 
     */
    public String asJson(){
        StringBuilder sb = new StringBuilder();
        sb.append("{\"message\": ");
        sb.append(this.getValueAsJsonString(getMessage()));
        sb.append(",\n");
        
        sb.append("\"stackTrace\": ");
        sb.append(this.getValueAsJsonString(getStackTrace()));
        sb.append(",\n");

        sb.append("\"threadId\": ");
        sb.append(this.getValueAsJsonString(getThreadId()));
        sb.append(",\n");

        sb.append("\"description\": ");
        sb.append(this.getValueAsJsonString(getDescription()));
        sb.append(",\n");

        sb.append("\"errorCode\": ");
        sb.append(this.getValueAsJsonString(getErrorCode()));
        sb.append(",\n");
        
        sb.append("\"timeStamp\": ");
        sb.append(this.getValueAsJsonString(getTimeStamp()));
        sb.append("}");
        return sb.toString();
    }

    @Schema(description="Error code to help identify issue")
    public String getErrorCode() {
        return _errorCode;
    }

    public void setErrorCode(String _errorCode) {
        this._errorCode = _errorCode;
    }

    @Schema(description="Human readable description of error")
    public String getMessage() {
        return _message;
    }

    public void setMessage(String _message) {
        this._message = _message;
    }

    @Schema(description="More detailed description of error")
    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    @Schema(description="Stack trace of error")
    public String getStackTrace() {
        return _stackTrace;
    }

    public void setStackTrace(String _stackTrace) {
        this._stackTrace = _stackTrace;
    }

    @Schema(description="Id of thread running process")
    public String getThreadId() {
        return _threadId;
    }

    public void setThreadId(String _threadId) {
        this._threadId = _threadId;
    }

    @Schema(description="UTC Time stamp in YYYY-MM-DDHH:MM.S")
    public String getTimeStamp() {
        return _timeStamp;
    }

    public void setTimeStamp(String _timeStamp) {
        this._timeStamp = _timeStamp;
    }
    
}
