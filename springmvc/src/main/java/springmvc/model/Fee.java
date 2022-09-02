package springmvc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fee")
public class Fee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int f_id;
	private String fCode;
	private String fName;
	private int c_id;
	
	@Column(name="c_id")
    public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	
	
	
	@Column(name="feeName")
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	@Column(name="fee_id")
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	
	
	
	@Column(name="FeeCode")
	public String getfCode() {
		return fCode;
	}
	public void setfCode(String fCode) {
		this.fCode = fCode;
	}
	
	
	
	
	
	
	
	
	
}
