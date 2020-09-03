package com.application.MobileCatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.application.MobileCatalogue.model.Mobile;
import com.application.MobileCatalogue.repo.MobileRepo;

@RestController
@RequestMapping("/mobile")
public class MobileController {
	@Autowired
	private MobileRepo mobilerepo;
	@PostMapping
	@RequestMapping("/add")
	@ResponseStatus(HttpStatus.OK)
	public String add(@RequestBody Mobile mobile) {
		System.out.println(mobile);
		mobilerepo.save(mobile);
		return "Item added to the cart";
	}
	

}
