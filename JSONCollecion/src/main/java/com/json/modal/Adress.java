package com.json.modal;

public class Adress {
	private String loc = null;
	private String hno = null;
	
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	@Override
	public String toString() {
		return "Adress [loc=" + loc + ", hno=" + hno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hno == null) ? 0 : hno.hashCode());
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adress other = (Adress) obj;
		if (hno == null) {
			if (other.hno != null)
				return false;
		} else if (!hno.equals(other.hno))
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		return true;
	}
	
}
