package com.ihorizons.migration.controllers;

import com.ihorizons.migration.services.MigrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/migrate")
public class MigrationController {

    private final MigrationService migrationService;

    public MigrationController(MigrationService migrationService) {
        this.migrationService = migrationService;
    }

    @PostMapping
    public void migrateData(){
        this.migrationService.migrateData();

    }
}
