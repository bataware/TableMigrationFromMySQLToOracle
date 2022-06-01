package com.ihorizons.migration.services;

import com.ihorizons.migration.persistence.db.GlPosting;
import com.ihorizons.migration.persistence.newrepositories.NewGlPostingRepository;
import com.ihorizons.migration.persistence.repositories.GlPostingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class MigrationService {

    private final NewDataService newDataService;
    private final GlPostingRepository dataRepository;
    private final NewGlPostingRepository newGlPostingRepository;

    public MigrationService(NewDataService newDataService, GlPostingRepository dataRepository, NewGlPostingRepository newGlPostingRepository) {
        this.newDataService = newDataService;
        this.dataRepository = dataRepository;
        this.newGlPostingRepository = newGlPostingRepository;
    }

    public void migrateData() {
        List<GlPosting> toBeMigrated = dataRepository.findByGlBatchNameOrGlBatchNameNull("");

        long nextBatch = Integer.parseInt(getMaxBatchNumber()) + 1;
        for (GlPosting row : toBeMigrated) {
            try {
                System.out.println("Migration: setting batch Name Row: GLBatchName: " + row.getGlBatchName() + ", ID: " + row.getId());
            }
            catch (Exception Ex)
            {
                System.out.println("Migration Warning: Exception occurred before setting Batch Name and printing row data, you may ignore the issue");
            }
            row.setGlBatchName("Batch-" + nextBatch + "-" + getCurrentDateFormatted());
            try {
                System.out.println("Migration: setting batch Name Row: GLBatchName: " + row.getGlBatchName() + ", ID: " + row.getId()+ "  is Done");
            }
            catch (Exception Ex)
            {
                System.out.println("Migration Warning: Exception occurred after setting Batch Name and printing row data, you may ignore the issue");
            }

        }
        try {
            System.out.println("Migration: inserting batch GLBatchName: "+ nextBatch);
            newDataService.insertData(toBeMigrated);
            System.out.println("Migration: inserting batch GLBatchName: "+ nextBatch + " is in progress");
            dataRepository.saveAll(toBeMigrated);
            System.out.println("Migration: insertion is complete for batch GLBatchName: "+ nextBatch);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getCurrentDateFormatted() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);

    }

    private String getMaxBatchNumber() {
        String batchNumber = newGlPostingRepository.maxBatch();

        if (batchNumber != null && !batchNumber.equalsIgnoreCase(""))
            try {
                Integer.parseInt(batchNumber);
            } catch (Exception e) {
                batchNumber = "0";
            }
        else {
            batchNumber = "0";
        }
        return batchNumber;
    }

}
