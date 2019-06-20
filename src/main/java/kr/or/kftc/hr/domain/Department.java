package kr.or.kftc.hr.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "departmentId")
@Table(name = "departments")
public class Department {
    @Id
    @Column(name = "department_id")
    public Long departmentId;
    @Column(name = "department_name")
    public String departmentName;
    @Column(name = "manager_id")
    public Long managerId;
    @Column(name = "location_id")
    public Long locationId;
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    public Set<Employee> employees = new HashSet<Employee>();
}