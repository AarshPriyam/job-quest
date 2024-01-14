package com.jobquest.application.service;

import com.jobquest.application.entity.JobListing;
import com.jobquest.application.repository.JobListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class JobListingService {

    @Autowired
    public JobListingRepository jobListingrepository;

    public List<JobListing> getAllJobs() {
        return jobListingrepository.findAll();
    }

    public JobListing getJob(Integer jobId) {
        return jobListingrepository.findById(jobId).get();
    }

    public void addJobs(JobListing job) {
        jobListingrepository.save(job);
    }

    public void updateJob(Integer jobId, JobListing job) {
        JobListing existingJob  = jobListingrepository.findById(jobId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "JobListing not found with ID: " + jobId));
// Conditionally update the title if not null
        if (job.getTitle() != null) {
            existingJob.setTitle(job.getTitle());
        }
        if (job.getLocation() != null) {
            existingJob.setLocation(job.getLocation());
        }
        // Similarly, update other fields as needed

        // Save the updated JobListing
        jobListingrepository.save(existingJob);
    }
    public void deleteJob(Integer jobId) {
        jobListingrepository.deleteById(jobId);
    }


    public List<JobListing> searchJobs(String query) {
        return jobListingrepository.findByTitleStartsWith(query);
    }
}
