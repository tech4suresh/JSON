package com.json.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@JsonProperty("user-name")
	private String uname = null;
	@JsonIgnore
	private String pwd = null;
	@JsonProperty("user_authority")
	private String urole;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUrole() {
		return urole;
	}

	public void setUrole(String urole) {
		this.urole = urole;
	}

	@Override
	public String toString() {
		return "User [pwd=" + pwd + ", uname=" + uname + ", urole=" + urole + "]";
	}

}
