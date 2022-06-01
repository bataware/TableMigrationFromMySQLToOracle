package com.ihorizons.migration.persistence.repositories;

import com.ihorizons.migration.persistence.db.GlPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GlPostingRepository extends JpaRepository<GlPosting, Long> {

    List<GlPosting> findByGlBatchNameOrGlBatchNameNull(String glBatchName);

//    @Query(nativeQuery = true, value = " \n" +
//            "SELECT  max( replace ( SUBSTRING_INDEX(GL_BATCH_NAME, '-', 2), 'Batch-', '') )  AS max_batch_number\n" +
//            "from magentodb.Gl_Posting \n" +
//            "limit 1")
//    String maxBatch();

}
