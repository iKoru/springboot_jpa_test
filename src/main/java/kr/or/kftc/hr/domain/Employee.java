package kr.or.kftc.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "employeeId")
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employee_id")
    public Long employeeId;
    @Column(name = "first_name")
    public String firstName;
    @Column(name = "last_name")
    public String lastName;
    public String email;
    @Column(name = "hire_date")
    public String hireDate;
    @Column(name = "job_id")
    public String jobId;
    public Float salary;
    @Column(name = "commission_pct")
    public Float commissionPct;
    @Column(name = "manager_id")
    public Long managerId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    public Department department;
}