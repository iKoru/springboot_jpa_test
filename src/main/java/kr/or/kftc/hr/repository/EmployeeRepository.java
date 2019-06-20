package kr.or.kftc.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.kftc.hr.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}