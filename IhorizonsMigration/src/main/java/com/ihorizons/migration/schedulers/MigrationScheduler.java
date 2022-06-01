package com.ihorizons.migration.schedulers;

import com.ihorizons.migration.services.MigrationService;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
@EnableScheduling
public class MigrationScheduler {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MigrationScheduler.class);
    private final MigrationService migrationService;

    public MigrationScheduler(MigrationService migrationService) {
        this.migrationService = migrationService;
    }


    @PostConstruct
    public void init() {
        LOGGER.info("Gl posting Migration :: Execution Time - {}", new Date(System.currentTimeMillis()));
        migrationService.migrateData();    }

    @Scheduled(cron = "${gl-migration-cron}")
    public void migrateGl() {
        LOGGER.info("Gl posting Migration :: Execution Time - {}", new Date(System.currentTimeMillis()));

        migrationService.migrateData();
    }

}
