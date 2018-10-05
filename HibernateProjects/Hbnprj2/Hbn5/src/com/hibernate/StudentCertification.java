package com.hibernate;
import javax.persistence.*;

@Entity
@Table(name="STUDENTCERTIFICATION")

public class StudentCertification{

	@Id
	@GeneratedValue
	private int cert_id;
	private String cert_name;
	public int getCert_id() {
		return cert_id;
	}
	public void setCert_id(int cert_id) {
		this.cert_id = cert_id;
	}
	public String getCert_name() {
		return cert_name;
	}
	public void setCert_name(String cert_name) {
		this.cert_name = cert_name;
	}
	
}
