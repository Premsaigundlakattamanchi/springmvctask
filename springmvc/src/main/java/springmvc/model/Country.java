package springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="country")

public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String countryName;
	private String countryCode;
	
	@Column(name="c_id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="countryName")
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Column(name="countryCode")
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", countryCode=" + countryCode + "]";
	}
	
	
	
}
