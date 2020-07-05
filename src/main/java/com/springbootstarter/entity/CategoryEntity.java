/**
 * Copyright(C) 2020 Luvina Software Company
 * CategoryEntity.java Jun 18, 2020 TuoiLV
 */
package com.springbootstarter.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author TuoiLv
 */
@Entity
@Table(name="category")
public class CategoryEntity extends BaseEntity {
	
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;

	@OneToMany(mappedBy = "category")
	private List<NewEntity> news = new ArrayList<>();
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the news
	 */
	public List<NewEntity> getNews() {
		return news;
	}

	/**
	 * @param news the news to set
	 */
	public void setNews(List<NewEntity> news) {
		this.news = news;
	}
	
	
	
}
