package lyh.blog.util;

import java.util.Date;

import org.joda.time.DateTime;
import org.junit.Test;

import lyh.common.constant.TimeConstant;

public class ConverseTime {
    
    public static String dateToString(Date date){
        DateTime dateTime = new DateTime(date);
        return  dateTime.toString(TimeConstant.CONVERSE_TIME);
    }
    
    public static Date getLastFiveDay(){
        DateTime dateTime = new DateTime(new Date());
        DateTime five = dateTime.minusDays(5);
        return five.toDate();
        
    }
    
}
