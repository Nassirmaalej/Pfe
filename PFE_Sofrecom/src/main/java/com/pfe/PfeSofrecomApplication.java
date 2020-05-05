package com.pfe;

import java.io.IOException;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.apache.tomcat.util.threads.TaskThread;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.github.shyiko.mysql.binlog.event.DeleteRowsEventData;
import com.github.shyiko.mysql.binlog.event.EventData;
import com.github.shyiko.mysql.binlog.event.UpdateRowsEventData;
import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;
import com.pfe.dao.RuleEventDao;
import com.pfe.dao.regleDao;
import com.pfe.entities.RuleEvent;
import com.pfe.service.RuleService;
import com.pfe.serviceimpl.RuleServiceImpl;
@SpringBootApplication

@RestController



public class PfeSofrecomApplication {
	
	

	

	public static void main (String[] args) throws Exception {
		

			

		SpringApplication.run(PfeSofrecomApplication.class, args);
		
		//  RuleServiceImpl regleserviceimpl = new RuleServiceImpl();

		// regleserviceimpl.redlog() ;
	

	
}

	
	


}
