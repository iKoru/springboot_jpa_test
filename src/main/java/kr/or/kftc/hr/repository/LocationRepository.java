package kr.or.kftc.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.or.kftc.hr.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}