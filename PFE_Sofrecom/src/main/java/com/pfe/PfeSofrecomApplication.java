package com.pfe;

import java.io.IOException;
import java.text.MessageFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.shyiko.mysql.binlog.BinaryLogClient;

@SpringBootApplication

@RestController
public class PfeSofrecomApplication {
	

	public static void main (String[] args) {
		SpringApplication.run(PfeSofrecomApplication.class, args);
	
	
	}
	

		
	
}
