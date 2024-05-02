package com.iancinti.bcraapi.application.port.usecase;

import com.iancinti.bcraapi.application.port.in.BCRAApplicationPort;
import com.iancinti.bcraapi.domain.VariableData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class GetPrincipalVariablesUseCase implements BCRAApplicationPort {

    private static final String BCRA_API_URL = "https://api.bcra.gob.ar/estadisticas/v1/principalesvariables";

    private final RestTemplate restTemplate;

    @Autowired
    public GetPrincipalVariablesUseCase(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public VariableData getPrincipalVariables() {
        try {

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<VariableData> response = restTemplate.exchange(BCRA_API_URL, HttpMethod.GET, entity, VariableData.class);

            if (response.getStatusCode() == HttpStatus.OK) {

                return response.getBody();
            } else {
                throw new Exception("Error " + response.getStatusCode() + ". " );
            }
        } catch (RestClientException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

