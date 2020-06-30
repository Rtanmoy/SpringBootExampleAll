package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Item {
	@Id
	@GeneratedValue
	private Integer id;
	private String code;
	private double cost;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", code=" + code + ", cost=" + cost + "]";
	}
	

}
