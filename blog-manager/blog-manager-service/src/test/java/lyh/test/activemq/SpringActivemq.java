package lyh.test.activemq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class SpringActivemq {

    public void produceTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-activemq.xml");
        JmsTemplate jmsTemplate = applicationContext.getBean(JmsTemplate.class);
        //从spring容器中取Destination对象
        Destination destination = (Destination) applicationContext.getBean("queueDestination");
        //使用JmsTemplate对象发送消息。
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                //创建一个消息对象并返回
                TextMessage textMessage = session.createTextMessage("spring activemq queue message");
                return textMessage;
            }
        });
        }

}
