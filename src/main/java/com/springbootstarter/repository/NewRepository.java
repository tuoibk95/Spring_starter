/**
 * Copyright(C) 2020 Luvina Software Company
 * NewRepository.java Jun 30, 2020 TuoiLV
 */
package com.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootstarter.entity.NewEntity;

/**
 * 
 * @author TuoiLv
 */
public interface NewRepository extends JpaRepository<NewEntity, Long>{

}
