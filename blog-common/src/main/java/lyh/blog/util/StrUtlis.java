package lyh.blog.util;

/**
* @ClassName: StrUtlis
* @Description: 字符串的相关工具类
* @author student.lyh
* @date 2017年10月4日 下午2:17:00
*/
public class StrUtlis {
    
    
    public static String substringByContent(String content2) {
        String content = content2.trim();
        String description = "";
        description = content.substring(3, content.indexOf("</p>"));
        System.out.println("content : " + content);
        System.out.println("description : " + description);
        return description;
    }
    

}
