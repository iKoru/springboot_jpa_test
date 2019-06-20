package kr.or.kftc.hr.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "job_history")
public class JobHistory {
    @Column(name = "employee_id")
    public Long employeeId;
    @Column(name = "start_date")
    public Date startDate;
    @Column(name = "end_date")
    public Date endDate;
    @Column(name = "job_id")
    public Long jobId;
    @Column(name = "department_id")
    public Long departmentId;
}