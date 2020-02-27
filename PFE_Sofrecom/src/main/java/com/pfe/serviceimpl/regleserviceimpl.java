package com.pfe.serviceimpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.BinaryLogClient.LifecycleListener;
import com.github.shyiko.mysql.binlog.event.DeleteRowsEventData;
import com.github.shyiko.mysql.binlog.event.EventData;
import com.github.shyiko.mysql.binlog.event.TableMapEventData;
import com.github.shyiko.mysql.binlog.event.UpdateRowsEventData;
import com.github.shyiko.mysql.binlog.event.WriteRowsEventData;

import com.pfe.dao.regleDao;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.service.Regleservice;
import com.pusher.rest.Pusher;
import com.pfe.entities.Rule;


@Service
public class regleserviceimpl implements Regleservice {

	@Autowired
	private regleDao ruleDao;
	private String res = "null";
	private String data;


	@Transactional
	@Override
	public StringResponse save(Rule rule) throws Exception {
		ruleDao.save(rule);
		return new StringResponse(true, "Ajout effecué");

	}

	@Transactional
	@Override
	public StringResponse update(Rule rule) throws Exception {
		ruleDao.save(rule);
		return new StringResponse(true, "Modification effecué");

	}

	@Transactional
	@Override
	public StringResponse delete(Long id) throws Exception {
		ruleDao.deleteById(id);
		return new StringResponse(true, "Suppression effecué");

	}

	@Transactional
	public List<Rule> findAll() throws Exception {
		return ruleDao.findAll();

	}

	

	public  String redlog() throws IOException {

		 
		EventData data1 = null;  
		  
		  final Map<String, Long> tableMap = new HashMap<String, Long>();
		  
		  BinaryLogClient client = new BinaryLogClient("localhost", 3306, "root", "");
		 
		  
		  client.registerEventListener(event -> { EventData data = event.getData();

		  if(data instanceof TableMapEventData) { TableMapEventData tableData =
		  (TableMapEventData)data; tableMap.put(tableData.getTable(),
		  tableData.getTableId()); 
		  
		  
		  System.out.println(data) ;
		  System.out.println("---hello1----");
		  }
		  
		  
		  else if(data instanceof WriteRowsEventData) { WriteRowsEventData eventData =
		  (WriteRowsEventData)data;
		  System.out.println(data) ;
		  System.out.println("---hello2----");
		  System.out.println(eventData) ;
		  this.data=data.toString();
		  try {
				client.disconnect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		  } 
		  
		  
			
			  else if(data instanceof DeleteRowsEventData) { DeleteRowsEventData eventData
			  = (DeleteRowsEventData)data; 
			  System.out.println(data) ;
			  System.out.println("---hello3----");
			  
			  this.data=data.toString();
			  try {
				client.disconnect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  }
			  
			  
			  else if(data instanceof UpdateRowsEventData) { UpdateRowsEventData eventData
			  = (UpdateRowsEventData)data; System.out.println(data) ;
			  System.out.println("---hello4----");
			  this.data=data.toString();
			  try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			 
		  
		  
		  } );
		  
		 
		  client.connect();
		
		 
		 
		  return this.data; 

		  
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 

	static Map<String, String> getRuleMap(Object[] regle) {
	Map<String, String> map = new HashMap<>();
	map.put("id", java.lang.String.valueOf(regle[0]));
	map.put("name", java.lang.String.valueOf(regle[1]));
		map.put("price", java.lang.String.valueOf(regle[2]));

		return map;
	}
	


	@Override
	public Rule findByOne(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}