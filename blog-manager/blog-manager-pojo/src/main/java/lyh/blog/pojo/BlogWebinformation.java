package lyh.blog.pojo;

import java.io.Serializable;
import java.util.Date;

public class BlogWebinformation implements Serializable {
    private Integer id;

    private Date time;

    private Integer totalcount;

    private Integer todaycount;

    private Integer articlecount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(Integer totalcount) {
        this.totalcount = totalcount;
    }

    public Integer getTodaycount() {
        return todaycount;
    }

    public void setTodaycount(Integer todaycount) {
        this.todaycount = todaycount;
    }

    public Integer getArticlecount() {
        return articlecount;
    }

    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", totalcount=").append(totalcount);
        sb.append(", todaycount=").append(todaycount);
        sb.append(", articlecount=").append(articlecount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}