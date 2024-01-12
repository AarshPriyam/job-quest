package com.jobquest.application.repository;

import com.jobquest.application.model.JobListing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobListingRepository extends CrudRepository<JobListing, Integer> {

    List<JobListing> findAll();
    List<JobListing> findByTitleStartsWith(String title);
}
