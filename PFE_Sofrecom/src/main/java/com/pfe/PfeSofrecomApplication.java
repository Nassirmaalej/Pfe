package com.pfe;

import java.io.IOException;
import java.text.MessageFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
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
	/*
	 * @Bean public BinaryLogClient getBinaryLogClient() { return new
	 * BinaryLogClient("localhost", 3306, "root", ""); }
	 */

		
	
}
