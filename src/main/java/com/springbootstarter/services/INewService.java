/**
 * Copyright(C) 2020 Luvina Software Company
 * INewService.java Jun 30, 2020 TuoiLV
 */
package com.springbootstarter.services;

import com.springbootstarter.dto.NewDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 
 * @author TuoiLv
 */
public interface INewService {
	NewDTO save(NewDTO newDTO);

	void delete(long[] ids);

	List<NewDTO> findAll(Pageable pageable);

	int totalItem();
}
