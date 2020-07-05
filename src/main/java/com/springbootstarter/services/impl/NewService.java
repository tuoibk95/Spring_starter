/**
 * Copyright(C) 2020 Luvina Software Company
 * NewService.java Jun 30, 2020 TuoiLV
 */
package com.springbootstarter.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstarter.converter.NewConverter;
import com.springbootstarter.dto.NewDTO;
import com.springbootstarter.entity.CategoryEntity;
import com.springbootstarter.entity.NewEntity;
import com.springbootstarter.repository.CategoryRepository;
import com.springbootstarter.repository.NewRepository;
import com.springbootstarter.services.INewService;

/**
 * 
 * @author TuoiLv
 */
@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private NewConverter newConverter;
	
	@Override
	public NewDTO save(NewDTO newDTO) {
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		NewEntity newEntity = newConverter.toEntity(newDTO);
		newEntity.setCategory(categoryEntity);
		newEntity = newRepository.save(newEntity);
		return newConverter.toDTO(newEntity);
	}
}
