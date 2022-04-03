package com.edureka.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Customers {
	@Id
	private int id;
	private String cname;
	  private String cemail;
	  @Override
	public String toString() {
		return "Customers [id=" + id + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
	
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

}
