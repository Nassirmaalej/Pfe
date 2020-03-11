
package com.pfe.serviceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
import com.pfe.dao.RuleEventDao;
import com.pfe.dao.regleDao;
import com.pfe.dto.RuleEventDto;
import com.pfe.dto.StringResponse;
import com.pfe.entities.Rule;
import com.pfe.entities.RuleEvent;
import com.pfe.service.RuleService;
import com.pusher.rest.Pusher;
import com.pfe.entities.Rule;

@Service
public class RuleServiceImpl implements RuleService {

	@Autowired
	private regleDao ruleDao;
	private String res = "null";
	private String data;
	String[] T = new String[116];
	int i = 0;
	List<RuleEvent> returnlistDao = new ArrayList<>();

//	@Autowired
	// private BinaryLogClient client;
	@Autowired
	private RuleEventDao ruleEventDao;

	@Transactional
	@Override
	public StringResponse save(Rule rule) throws Exception {
		ruleDao.save(rule);
		return new StringResponse(true, "Ajout effecué");

	}
	

	
	

	@Transactional
	@Override
	public StringResponse save(RuleEvent rule1) throws Exception {
		ruleEventDao.save(rule1);
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

	public List<RuleEvent> findAll1() throws Exception {
		return ruleEventDao.findAll();

	}

	public void redlog() throws IOException, TimeoutException {

		BinaryLogClient client = new BinaryLogClient("localhost", 3306, "root", "");

		List<RuleEventDto> returnList = new ArrayList<>();

		List<RuleEventDto> returnlistWithoutDuplicates = new ArrayList<>();

		final Map<Rule, Long> rule = new HashMap<Rule, Long>();

		client.registerEventListener(event -> {
			EventData data = event.getData();

			if (data instanceof WriteRowsEventData) {
				WriteRowsEventData eventData = (WriteRowsEventData) data;
				System.out.println(data);
				System.out.println("---hello2----");

				this.data = data.toString();

				String a = this.data;

				try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (a.length() > 113) {
					RuleEvent RuleEvent = new RuleEvent();
					RuleEvent.setType(a.substring(0, 18));
					RuleEvent.setLabel("Evenement" + a);
					RuleEvent.setDetail("[" + a.substring(113));

					System.out.println(returnlistDao);
					try {
						client.disconnect();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ruleEventDao.save(RuleEvent);

				}

			}

			//
			//

			else if (data instanceof DeleteRowsEventData) {
				DeleteRowsEventData eventData = (DeleteRowsEventData) data;
				System.out.println(data);
				System.out.println("---hello3----");

				this.data = data.toString();

				String a = this.data;

				try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if (a.length() > 130)

				{
					RuleEvent RuleEvent = new RuleEvent();
					RuleEvent.setType(a.substring(0, 19));
					RuleEvent.setLabel("Evenement" + a);
					RuleEvent.setDetail("[" + a.substring(113));

					System.out.println(returnlistDao);

					ruleEventDao.save(RuleEvent);
				}
			}

			else if (data instanceof UpdateRowsEventData) {
				UpdateRowsEventData eventData = (UpdateRowsEventData) data;
				System.out.println(data);
				System.out.println("---hello4----");
				this.data = data.toString();

				 String a = this.data;

				try {
					client.disconnect();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (a.length() > 130) {
					RuleEvent RuleEvent = new RuleEvent();
					RuleEvent.setType(a.substring(0, 19));
					RuleEvent.setLabel("Evenement" );
					RuleEvent.setDetail("[" + a.substring(163));
					System.out.println(returnlistDao);

					ruleEventDao.save(RuleEvent);
				}

			}

		});

		client.connect(100);

		returnlistDao = new ArrayList<>(new HashSet<>(returnlistDao));

	}

	public static Object[] supprimer_doublon(String[] args) {

		List list = Arrays.asList(args);
		Set set = new HashSet(list);

		System.out.print("Résultat de suppression des doublons: ");

		Object[] result = new Object[set.size()];
		set.toArray(result);

		return result;
	}

	@Override
	public Rule findByOne(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

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
