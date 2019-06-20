package kr.or.kftc.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "countries")
@EqualsAndHashCode(of = "countryId")
@Data
public class Country {
    @Id
    @Column(name = "country_id")
    public Long countryId;
    @Column(name = "country_name")
    public String countryName;
    @Column(name = "region_id")
    public Long regionId;
}