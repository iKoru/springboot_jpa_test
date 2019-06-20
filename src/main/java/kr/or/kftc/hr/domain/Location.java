package kr.or.kftc.hr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@Table(name = "locations")
@EqualsAndHashCode(of = "locationId")
public class Location {
    @Id
    @Column(name = "location_id")
    public Long locationId;
    @Column(name = "street_address")
    public String streetAddress;
    @Column(name = "postalCode")
    public String postalCode;
    public String city;
    @Column(name = "state_province")
    public String stateProvince;
    @Column(name = "country_id")
    public Long countryId;
}