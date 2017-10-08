package lyh.blog.common.pojo;

import java.io.Serializable;

public class ArticleDO<T> implements Serializable{
    /**
     * @Fields serialVersionUID : 
     */
    private static final long serialVersionUID = 1L;
    private T obj;
    private String message;
    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    

}
