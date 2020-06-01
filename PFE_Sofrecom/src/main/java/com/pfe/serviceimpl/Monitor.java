/*
 * package com.pfe.serviceimpl;
 * 
 * import java.io.IOException; import java.util.ArrayList; import
 * java.util.List; import java.util.concurrent.TimeoutException;
 * 
 * import javax.annotation.PostConstruct;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Component;
 * 
 * import com.github.shyiko.mysql.binlog.BinaryLogClient; import
 * com.github.shyiko.mysql.binlog.event.DeleteRowsEventData; import
 * com.github.shyiko.mysql.binlog.event.EventData; import
 * com.github.shyiko.mysql.binlog.event.UpdateRowsEventData; import
 * com.github.shyiko.mysql.binlog.event.WriteRowsEventData; import
 * com.pfe.dao.RuleEventDao; import com.pfe.dao.regleDao; import
 * com.pfe.entities.RuleEvent;
 * 
 * @Component public class Monitor {
 * 
 * @Autowired private regleDao ruleDao; private String res = "null"; private
 * String data; String[] T = new String[116]; int i = 0; int pos=0;
 * List<RuleEvent> returnlistDao = new ArrayList<>(); private RuleEventDao
 * ruleEventDao;
 * 
 * @PostConstruct public void redlog() throws IOException, TimeoutException {
 * 
 * BinaryLogClient client = new BinaryLogClient("localhost", 3306, "root", "");
 * 
 * 
 * client.registerEventListener(event -> { EventData data = event.getData();
 * if(data instanceof WriteRowsEventData) { WriteRowsEventData eventData =
 * (WriteRowsEventData)data;
 * 
 * this.data = eventData.toString(); String a = this.data;
 * System.out.println(a);
 * 
 * if (a.length() > 113) {
 * 
 * RuleEvent RuleEvent = new RuleEvent();
 * RuleEvent.setType("Evenement d'insertion"); RuleEvent.setLabel("Evenement" +
 * a.substring(0, 18)); RuleEvent.setDetail("LE TABLEAU AJOUTER : {[" +
 * a.substring(112));
 * 
 * String format = "dd/MM/yy";
 * 
 * java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format
 * ); java.util.Date date = new java.util.Date();
 * 
 * RuleEvent.setDate( formater.format( date ) );
 * 
 * try { client.disconnect(); } catch (IOException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } ruleEventDao.save(RuleEvent); try {
 * redlog() ; } catch (IOException | TimeoutException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); }}
 * 
 * 
 * }
 * 
 * if(data instanceof DeleteRowsEventData) { DeleteRowsEventData eventData =
 * (DeleteRowsEventData)data;
 * 
 * this.data = eventData.toString(); String a = this.data;
 * System.out.println(a);
 * 
 * if (a.length() > 113) { RuleEvent RuleEvent = new RuleEvent();
 * RuleEvent.setType("Evenement de suppression"); RuleEvent.setLabel("Evenement"
 * + a.substring(0,19)); RuleEvent.setDetail("LE TABLEAU SUPPRIME: {[" +
 * a.substring(113)); String format = "dd/MM/yy";
 * 
 * java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format
 * ); java.util.Date date = new java.util.Date();
 * 
 * RuleEvent.setDate( formater.format( date ) ); try { client.disconnect(); }
 * catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } ruleEventDao.save(RuleEvent); try { redlog() ; } catch
 * (IOException | TimeoutException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }}
 * 
 * 
 * }
 * 
 * 
 * 
 * if(data instanceof UpdateRowsEventData) { UpdateRowsEventData eventData =
 * (UpdateRowsEventData)data;
 * 
 * this.data = eventData.toString(); String a = this.data;
 * System.out.println(a);
 * 
 * if (a.length() > 113) { RuleEvent RuleEvent = new RuleEvent();
 * RuleEvent.setType("Evenement de modification");
 * RuleEvent.setLabel("Evenement" +a.substring(0, 19));
 * RuleEvent.setDetail("LES MODIFICATION {[" + a.substring(189)); String format
 * = "dd/MM/yy";
 * 
 * java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format
 * ); java.util.Date date = new java.util.Date();
 * 
 * RuleEvent.setDate( formater.format( date ) ); try { client.disconnect(); }
 * catch (IOException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } ruleEventDao.save(RuleEvent); try { redlog() ; } catch
 * (IOException | TimeoutException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }}
 * 
 * 
 * }
 * 
 * 
 * 
 * } ) ;
 * 
 * client.connect();
 * 
 * 
 * 
 * } }
 */