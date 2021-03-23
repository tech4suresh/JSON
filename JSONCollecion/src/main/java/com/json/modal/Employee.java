package com.json.modal;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int eid;
	private String ename;
	private double esal;
	private List<String> eprjs;
	private Set<String> modules;
	private Map<String, Integer> prjvr = null;
	private Adress adress = null;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public List<String> getEprjs() {
		return eprjs;
	}
	public void setEprjs(List<String> eprjs) {
		this.eprjs = eprjs;
	}
	public Set<String> getModules() {
		return modules;
	}
	public void setModules(Set<String> modules) {
		this.modules = modules;
	}
	public Map<String, Integer> getPrjvr() {
		return prjvr;
	}
	public void setPrjvr(Map<String, Integer> prjvr) {
		this.prjvr = prjvr;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eprjs=" + eprjs + ", modules="
				+ modules + ", prjvr=" + prjvr + ", adress=" + adress + "]";
	}

	
}
