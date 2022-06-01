package com.ihorizons.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class IhorizonsMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IhorizonsMigrationApplication.class, args);
    }

}
