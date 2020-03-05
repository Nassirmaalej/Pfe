package com.pfe.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

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
import com.pfe.dto.RuleEventDto;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.service.RuleService;
import com.pusher.rest.Pusher;
import com.pfe.entities.Rule;

@Service
public class RuleServiceImpl implements RuleService {

	@Autowired
	private regleDao ruleDao;
	private String res = "null";
	private String data;
	String T[] = new String[116];
	int i = 0;

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

	public List<RuleEventDto> redlog() throws IOException, TimeoutException {

		List<RuleEventDto> returnList = new ArrayList<>();
		List<RuleEventDto> returnListfinal = new ArrayList<>();
	
		final Map<String, Long> tableMap = new HashMap<String, Long>();

		BinaryLogClient client = new BinaryLogClient("localhost", 3306, "root", "");

		client.registerEventListener(event -> {
			EventData data = event.getData();

			if (data instanceof TableMapEventData) {
				TableMapEventData tableData = (TableMapEventData) data;
				tableMap.put(tableData.getTable(), tableData.getTableId());

				System.out.println(data);

				System.out.println("---hello1----");

			}

			else if (data instanceof WriteRowsEventData) {
				WriteRowsEventData eventData = (WriteRowsEventData) data;
				System.out.println(data);
				System.out.println("---hello2----");
				

				this.data = data.toString();
				T[i] = this.data;

				i++;
				String a = this.data;
				
				try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

			}

			else if (data instanceof DeleteRowsEventData) {
				DeleteRowsEventData eventData = (DeleteRowsEventData) data;
				System.out.println(data);
				System.out.println("---hello3----");

				this.data = data.toString();
				T[i] =   this.data;

				i++;
				try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			else if (data instanceof UpdateRowsEventData) {
				UpdateRowsEventData eventData = (UpdateRowsEventData) data;
				System.out.println(data);
				System.out.println("---hello4----");
				this.data = data.toString();
				T[i] =  this.data;

				i++;
				try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		});

	
			client.connect(100);
	

		String A[] = new String[i];

		for (int j = 0; j < i; j++) {
			RuleEventDto evenement = new RuleEventDto();
			evenement.setType(T[j].substring(0, 31));
			evenement.setLabel("Evenement"+ j);
			evenement.setDetail("["+T[j].substring(112));
			returnList.add(evenement);
			
//		  T[j]=T[j].substring( 0,  27) + T[j].substring(108);

			A[j] = T[j];

		}

		List<RuleEventDto> returnlistWithoutDuplicates = returnList.stream()
			     .distinct()
			     .collect(Collectors.toList());
		// return new ResponseEntity<String>("Réponse du serveur:
		// "+HttpStatus.OK.name(), HttpStatus.OK);
		
//		  List<RuleEventDto>returnlistWithoutDuplicates = new ArrayList<>(
//			      new HashSet<>(returnList));
		return returnlistWithoutDuplicates;
	
	}

	@Override
	public Rule findByOne(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new ArrayList 
        ArrayList<T> newList = new ArrayList<T>(); 
  
        // Traverse through the first list 
        for (T element : list) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
  
        // return the new list 
        return newList; 
    } 

}