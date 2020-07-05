/**
 * Copyright(C) 2020 Luvina Software Company
 * NewAPI.java Jun 17, 2020 TuoiLV
 */
package com.springbootstarter.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootstarter.dto.NewDTO;

/**
 * 
 * @author TuoiLv
 */
@RestController
public class NewAPI {
	
	@GetMapping(value = "/new")
	public NewDTO getNew(@RequestBody NewDTO model) {
		return model;
	}
	
	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return model;
	}
	
	@PutMapping(value = "/new")
	public NewDTO updateNew(@RequestBody NewDTO model) {
		return model;
	}
	
	@DeleteMapping(value = "/new") 
	public void deleteNew(@RequestBody long[] ids) {
	}
}

