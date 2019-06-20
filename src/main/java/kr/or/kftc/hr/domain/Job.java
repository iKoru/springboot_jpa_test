package kr.or.kftc.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "jobs")
@EqualsAndHashCode(of = "jobId")
@Data
public class Job {
    @Id
    @Column(name = "job_id")
    public Long jobId;
    @Column(name = "job_title")
    public String jobTitle;
    @Column(name = "min_salary")
    public Float minSalary;
    @Column(name = "max_salary")
    public Float maxSalary;

}