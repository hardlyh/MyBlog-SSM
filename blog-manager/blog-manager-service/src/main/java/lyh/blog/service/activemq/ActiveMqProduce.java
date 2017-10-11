package lyh.blog.service.activemq;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class ActiveMqProduce {
    
    @Autowired
    private  JmsTemplate jmsTemplate;
    
    @Resource
    private  Destination queueDestination;
    
    public  void sendActiceMq(final String str){
        jmsTemplate.send(queueDestination, new MessageCreator() {
          @Override
          public Message createMessage(Session session) throws JMSException {
              TextMessage textMessage = session.createTextMessage(str);
              return textMessage;
          }
      });
        
    }
    
    
    
    
    
    
    

}
