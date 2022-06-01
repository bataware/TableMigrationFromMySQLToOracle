package com.ihorizons.migration.persistence.newrepositories;

import com.ihorizons.migration.persistence.newdb.NewGlPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NewGlPostingRepository extends JpaRepository<NewGlPosting,Long> {
    @Query(nativeQuery = true , value = "SELECT  max (to_number (replace ( SUBSTR(GL_BATCH_NAME, INSTR(GL_BATCH_NAME ,'-'),  INSTR(GL_BATCH_NAME ,'-2022') - INSTR(GL_BATCH_NAME ,'-')) , '-', '') ) ) AS max_batch_number\n" +
            "from NMT.NMTC_GL_INTG_STG")
 String maxBatch ();
}
