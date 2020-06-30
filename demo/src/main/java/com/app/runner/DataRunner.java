package com.app.runner;

import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.app.model.Project;
@Component
@ConfigurationProperties("my.data")
public class DataRunner implements CommandLineRunner {
	private int sid;
	private String scode;
	private double sfee;
	
	private Map<String,String> subjs;
	private List<String> sprjs;
	
	private Project pob;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
	}

	public DataRunner() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	public Map<String, String> getSubjs() {
		return subjs;
	}

	public void setSubjs(Map<String, String> subjs) {
		this.subjs = subjs;
	}

	public List<String> getSprjs() {
		return sprjs;
	}

	public void setSprjs(List<String> sprjs) {
		this.sprjs = sprjs;
	}

	public Project getPob() {
		return pob;
	}

	public void setPob(Project pob) {
		this.pob = pob;
	}

	@Override
	public String toString() {
		return "DataRunner [sid=" + sid + ", scode=" + scode + ", sfee=" + sfee + "]";
	}
  
}
