package com.dentsu.dwsproject.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentsu.dwsproject.entity.Band;
import com.dentsu.dwsproject.service.RequestServiceImpl;

@RestController
@RequestMapping("/bandas")
public class BandController {

	@GetMapping("")
	@Cacheable("bandas")
	public String listarBandas() throws IOException, InterruptedException {
		RequestServiceImpl r = new RequestServiceImpl();
		String resp = r.getBandas();
		return resp;
	}
	
}
