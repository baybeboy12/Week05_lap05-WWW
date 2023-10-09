package com.example.repositories;

import com.example.entities.Candidate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;



import java.util.List;

public interface CandidatRopository extends Repository<Candidate,Long> {
    @Query("select c from Candidate c")
    List<Candidate> findAll();

}
