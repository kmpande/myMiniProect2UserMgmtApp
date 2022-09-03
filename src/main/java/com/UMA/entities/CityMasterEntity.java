package com.UMA.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "city_dtls")
@Getter
@Setter
public class CityMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cityId;
	private String cityName;
	

}
