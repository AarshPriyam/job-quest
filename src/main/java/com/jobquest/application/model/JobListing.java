package com.jobquest.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class JobListing {

    @Id
    @Column(name = "job_id")
    private Long JobId;
//    @Column(name = "employer_id", nullable = false)
//    private User employer;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "salary")
    private Long salary;
    @Column(name = "requirements")
    private String requirements;
    @Column(name = "deadline", nullable = false)
    private LocalDate deadline;
}
