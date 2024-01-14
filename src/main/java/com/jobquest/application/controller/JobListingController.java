package com.jobquest.application.controller;

import com.jobquest.application.entity.JobListing;
import com.jobquest.application.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class JobListingController {
    @Autowired
    public JobListingService jobListingService;
//  show all jobs
    @RequestMapping("/jobs")
    public List<JobListing> getAllJobLists() {
        return jobListingService.getAllJobs();
    }
//  Show particular job
    @RequestMapping("/jobs/{jobId}")
    public JobListing getJob(@PathVariable Integer jobId) {
        return jobListingService.getJob(jobId);
    }
//    Post a job opening
    @PostMapping("/jobs/create")
    public void addJobs(@RequestBody JobListing job) {
        jobListingService.addJobs(job);
    }
//    update a job opening
    @PutMapping("/jobs/{jobId}")
    public void updateJob(@RequestBody JobListing job, @PathVariable Integer jobId) {
        jobListingService.updateJob(jobId,job);
    }
//  Delete a job
    @DeleteMapping("/jobs/{jobId}")
    public void deleteJob(@PathVariable Integer jobId) {
        jobListingService.deleteJob(jobId);
    }
//   Search a  job
    @GetMapping("/search/{title}")
    public List<JobListing> search(@PathVariable("title") String title){
        System.out.println(title);
        return jobListingService.searchJobs(title);
    }
}
