package com.ihorizons.migration.services;

import com.ihorizons.migration.persistence.db.GlPosting;
import com.ihorizons.migration.persistence.newdb.NewGlPosting;
import com.ihorizons.migration.persistence.newrepositories.NewGlPostingRepository;
import org.hibernate.collection.spi.PersistentCollection;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class NewDataService {

    // insert here
    private final NewGlPostingRepository newDataRepository ;

    public NewDataService(NewGlPostingRepository newDataRepository) {
        this.newDataRepository = newDataRepository;
    }
    boolean insertData(List<GlPosting> data) {
        List<NewGlPosting> newDataList= new ArrayList<>();
        for(GlPosting row: data) {
            newDataList.add(map(row));
        }
        try {
            newDataRepository.saveAll(newDataList);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

    private NewGlPosting map(GlPosting row) {
        NewGlPosting map = getModelMapper().map(row, NewGlPosting.class);
        map.setCreationDate(new Date(System.currentTimeMillis()));
        map.setId(Long.valueOf(row.getId()));
        return map;
    }
    private ModelMapper getModelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STANDARD).setAmbiguityIgnored(true);
        mapper.getConfiguration().setPropertyCondition(context -> !(context.getSource() instanceof PersistentCollection));
        return mapper;
    }
}
