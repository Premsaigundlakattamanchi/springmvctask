package springmvc.Dto;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.mysql.fabric.Response;

public class CountryDTO {
		

	private int id;
	private String countryName;
	private String countryCode;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	
}
