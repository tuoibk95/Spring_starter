/**
 * Copyright(C) 2020 Luvina Software Company
 * INewService.java Jun 30, 2020 TuoiLV
 */
package com.springbootstarter.services;

import com.springbootstarter.dto.NewDTO;

/**
 * 
 * @author TuoiLv
 */
public interface INewService {
	public NewDTO save(NewDTO newDTO);

	public NewDTO update(NewDTO newDTO);
}
