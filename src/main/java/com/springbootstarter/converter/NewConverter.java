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
		if (entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumbnail(entity.getThumbnail());
		dto.setCreateBy(entity.getCreatedBy());
		dto.setCreateDate(entity.getCreateDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		return dto;
	}

	public NewEntity toEntity(NewDTO dto, NewEntity entity) {
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		return entity;
	}
}
