package lyh.blog.util;

import java.util.Date;

import org.joda.time.DateTime;

import lyh.common.constant.TimeConstant;

public class ConverseTime {
    
    public static String dateToString(Date date){
        DateTime dateTime = new DateTime(new Date());
        return  dateTime.toString(TimeConstant.CONVERSE_TIME);
    }

}
