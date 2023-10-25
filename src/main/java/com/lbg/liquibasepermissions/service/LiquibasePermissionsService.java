package com.lbg.liquibasepermissions.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LiquibasePermissionsService {
    @Value("${clientId:unknown}")
    private String name;

    public String manageSchema() {
        return manageSchema(name);
    }

    public String manageSchema(String name) {
        return "Hello " + name;
    }
}
