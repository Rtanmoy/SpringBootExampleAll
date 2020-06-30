package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="probtab")
@Data
public class Product {
	@Id
	@Column(name="pid")
	@GeneratedValue
    private Integer id;
	@Column(name="pname")
	private String prodName;
	@Column(name="pCost")
	private Double prodCost;
	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdCost() {
		return prodCost;
	}
	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodCost=" + prodCost + "]";
	}

}
