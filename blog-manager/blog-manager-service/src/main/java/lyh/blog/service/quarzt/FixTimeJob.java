package lyh.blog.service.quarzt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lyh.blog.service.activemq.ActiveMqProduce;

@Component
public class FixTimeJob {
    
    @Autowired
    private ActiveMqProduce activeMqProduce; // activeMq 对象
    
    public void send(){
        System.out.println("定时任务执行");
        activeMqProduce.sendActiceMq("createLeft");
    }

}
