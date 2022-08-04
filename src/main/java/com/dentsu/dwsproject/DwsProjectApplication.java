package com.dentsu.dwsproject;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.dentsu.dwsproject.controller.BandController;
import com.dentsu.dwsproject.service.RequestServiceImpl;

@EnableCaching
@SpringBootApplication
public class DwsProjectApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DwsProjectApplication.class, args);
	}

}