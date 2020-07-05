/**
 * Copyright(C) 2020 Luvina Software Company
 * NewConverter.java Jun 30, 2020 TuoiLV
 */
package com.springbootstarter.converter;

import org.springframework.stereotype.Component;

import com.springbootstarter.dto.NewDTO;
import com.springbootstarter.entity.NewEntity;

/**
 * 
 * @author TuoiLv
 */
@Component
public class NewConverter {
	public  NewEntity toEntity(NewDTO dto) {
		NewEntity newEntity = new NewEntity();
		newEntity.setTitle(dto.getTitle());
		newEntity.setContent(dto.getContent());
		newEntity.setShortDescription(dto.getShortDescription());
		newEntity.setThumbnail(dto.getThumbnail());
		return newEntity;
	}

	public NewDTO toDTO(NewEntity entity) {
		NewDTO dto = new NewDTO();
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumbnail(entity.getThumbnail());
		return dto;
	}
}
