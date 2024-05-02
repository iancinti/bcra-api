package com.iancinti.bcraapi.domain;

import java.util.List;

public class BCRAVariablesResponse {
    private int status;
    private List<String> errorMessages;
    private List<PrincipalVariable> results;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public List<PrincipalVariable> getResults() {
        return results;
    }

    public void setResults(List<PrincipalVariable> results) {
        this.results = results;
    }
}
