/**
 * Copyright(C) 2020 Luvina Software Company
 * NewAPI.java Jun 17, 2020 TuoiLV
 */
package com.springbootstarter.api;

import com.springbootstarter.api.output.NewOutput;
import com.springbootstarter.services.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.springbootstarter.dto.NewDTO;

/**
 * 
 * @author TuoiLv
 */
@RestController
public class NewAPI {

	@Autowired
	private INewService newService;

	@GetMapping(value = "/new")
	public NewOutput showNew(@RequestParam("page") int page, @RequestParam("limit") int limit) {
		NewOutput result = new NewOutput();
		result.setPage(page);
		Pageable pageable = new PageRequest(page - 1, limit);
		result.setListResult(newService.findAll(pageable));
		result.setTotalPage((int) Math.ceil((double) (newService.totalItem()) / limit));
		return result;
	}

	@PostMapping(value = "/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return newService.save(model);
	}
	
	@PutMapping(value = "/new/{id}")
	public NewDTO updateNew(@RequestBody NewDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return newService.save(model);
	}
	
	@DeleteMapping(value = "/new") 
	public void deleteNew(@RequestBody long[] ids) {
		newService.delete(ids);
	}
}

