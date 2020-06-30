package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="producttab")
@Data
public class Product {
	@Id
	@Column(name="pid")
	@GeneratedValue
	private Integer id;
	
	@Column(name="pcode")
	private String code;
	@Column(name="pname")
	private String name;
	
	@Column(name="pcost")
	private Double cost;
	@Column(name="pgst")
	private Integer gst;
	
	@Column(name="pnote")
	private String note;

	public Product() {
		super();
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getGst() {
		return gst;
	}

	public void setGst(Integer gst) {
		this.gst = gst;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", cost=" + cost + ", gst=" + gst + ", note="
				+ note + "]";
	}
	
}
