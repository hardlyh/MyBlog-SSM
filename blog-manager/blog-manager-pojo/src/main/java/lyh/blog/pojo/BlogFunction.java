package lyh.blog.pojo;

import java.io.Serializable;

public class BlogFunction implements Serializable {
    private Short id;

    private String name;

    private String description;

    private String code;

    private String pageUrl;

    private Byte pid;

    private Byte generatemenu;

    private Byte zindex;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    public Byte getPid() {
        return pid;
    }

    public void setPid(Byte pid) {
        this.pid = pid;
    }

    public Byte getGeneratemenu() {
        return generatemenu;
    }

    public void setGeneratemenu(Byte generatemenu) {
        this.generatemenu = generatemenu;
    }

    public Byte getZindex() {
        return zindex;
    }

    public void setZindex(Byte zindex) {
        this.zindex = zindex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", code=").append(code);
        sb.append(", pageUrl=").append(pageUrl);
        sb.append(", pid=").append(pid);
        sb.append(", generatemenu=").append(generatemenu);
        sb.append(", zindex=").append(zindex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}