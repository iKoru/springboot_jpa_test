package kr.or.kftc.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "regions")
@Data
@EqualsAndHashCode(of = "regionId")
public class Region {
    @Id
    @Column(name = "region_id")
    public Long regionId;
    @Column(name = "region_name")
    public String regionName;

}