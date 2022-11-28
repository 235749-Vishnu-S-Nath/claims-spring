package com.ust.claims.api.specialist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SpecialistRepository extends JpaRepository<Specialist,Integer> {
    /*
    @Query(value = "SELECT q FROM Specialist q WHERE q.treatmentId=?1")
    List<Specialist> findByTreatmentId(Integer id);

     */
}
