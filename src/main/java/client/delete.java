package hello;
import java.util.*;
import org.apache.pulsar.client.admin.PulsarAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DeleteTopics {
  public String deleteAllTopics(String namespace) {
          int i=0;
      try{
          PulsarAdmin admin = PulsarAdmin.builder().serviceHttpUrl("http://0.0.0.0:8080").build();
          //namespace tenant01/namespace01
          System.out.println(namespace);
          List<String> topiclist = admin.topics().getList(namespace);
          for(String s:topiclist){
                  admin.topics().delete(s,true);
                  System.out.println(s);
                  i++;
          }
      }catch(Exception e){
              System.err.println("Exce:::" + e);
      }
      //admin.close();
      System.out.println(i);
      return "Hello world!";
  }
}