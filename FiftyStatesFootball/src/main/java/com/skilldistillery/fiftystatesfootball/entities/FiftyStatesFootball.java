package com.skilldistillery.fiftystatesfootball.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fifty_states_football")
public class FiftyStatesFootball {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;

	@Column(name = "capital_city")
	private String capitalCity;

	@Column(name = "stadium_name")
	private String stadiumName;

	@Column(name = "year_admitted")
	private int yearAdmitted;

	@Column(name = "head_coach_name")
	private String headCoachName;

	public FiftyStatesFootball() {
	}

	public FiftyStatesFootball(String name, String capitalCity, String stadiumName, int yearAdmitted,
			String headCoachName) {
		super();
		this.name = name;
		this.capitalCity = capitalCity;
		this.stadiumName = stadiumName;
		this.yearAdmitted = yearAdmitted;
		this.headCoachName = headCoachName;
	}

	

	public FiftyStatesFootball(int id, String name, String capitalCity, String stadiumName, int yearAdmitted,
			String headCoachName) {
		super();
		this.id = id;
		this.name = name;
		this.capitalCity = capitalCity;
		this.stadiumName = stadiumName;
		this.yearAdmitted = yearAdmitted;
		this.headCoachName = headCoachName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public String getStadiumName() {
		return stadiumName;
	}

	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}

	public int getYearAdmitted() {
		return yearAdmitted;
	}

	public void setYearAdmitted(int yearAdmitted) {
		this.yearAdmitted = yearAdmitted;
	}

	public String getHeadCoachName() {
		return headCoachName;
	}

	public void setHeadCoachName(String headCoachName) {
		this.headCoachName = headCoachName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FiftyStatesFootball other = (FiftyStatesFootball) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Team ID= " + id + ", name=" + name + ", capitalCity=" + capitalCity + ", stadiumName=" + stadiumName
				+ ", yearAdmitted=" + yearAdmitted + ", headCoachName=" + headCoachName + "]";
	}

}
