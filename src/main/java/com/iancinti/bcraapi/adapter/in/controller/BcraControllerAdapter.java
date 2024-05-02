package com.iancinti.bcraapi.adapter.in.controller;

import com.iancinti.bcraapi.application.port.usecase.GetPrincipalVariablesUseCase;
import com.iancinti.bcraapi.domain.VariableData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bcra")
public class BcraControllerAdapter {

    @Autowired
    private GetPrincipalVariablesUseCase getPrincipalVariablesUseCase;

    @GetMapping("/principalesvariables")
    public VariableData getPrincipalVariables() {
        return getPrincipalVariablesUseCase.getPrincipalVariables();
    }
}
