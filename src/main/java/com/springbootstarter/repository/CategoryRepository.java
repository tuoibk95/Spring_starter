/**
 * Copyright(C) 2020 Luvina Software Company
 * CategoryRepository.java Jun 30, 2020 TuoiLV
 */
package com.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootstarter.entity.CategoryEntity;

/**
 * 
 * @author TuoiLv
 */
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
	CategoryEntity findOneByCode(String code);

}
