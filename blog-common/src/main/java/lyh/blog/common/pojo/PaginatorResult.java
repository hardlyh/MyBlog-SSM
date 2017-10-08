package lyh.blog.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
* @ClassName: PaginatorResult
* @Description: 封装分页对象返回给客户端
* @author student.lyh
* @date 2017年10月3日 下午2:24:10
*/
public class PaginatorResult implements Serializable{
    private long total;   // 总记录条数
    
    private List rows;    // 数据      

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

}
