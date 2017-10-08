package lyh.blog.pojo;

import java.io.Serializable;
import java.util.Date;

import lyh.blog.util.ConverseTime;

public class BlogCategory implements Serializable {
    private Integer id;

    private Byte isParent;

    private Integer parentId;

    private String name;

    private Date gmtCreate;

    private Date gmtModified;

    private Short pageamountCategory;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getIsParent() {
        return isParent;
    }

    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getGmtModified() {
        return ConverseTime.dateToString(this.gmtModified);
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Short getPageamountCategory() {
        return pageamountCategory;
    }

    public void setPageamountCategory(Short pageamountCategory) {
        this.pageamountCategory = pageamountCategory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", isParent=").append(isParent);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", pageamountCategory=").append(pageamountCategory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}