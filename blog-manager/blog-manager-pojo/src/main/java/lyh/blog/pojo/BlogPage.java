package lyh.blog.pojo;

import java.io.Serializable;
import java.util.Date;

import lyh.blog.util.ConverseTime;

public class BlogPage implements Serializable {
    private Integer id;

    private String pageTitle;

    private String pageHtmlUrl;

    private Short pageViewingCount;

    private Date gmtCreate;

    private Date gmtModified;

    private String pageTag;

    private Byte pageIsPrivate;

    private String pageImgurl;

    private String pageDescription;
    
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getPrivateStr(){
        if(this.pageIsPrivate==1){
            return "私密";
        }
        return "公开";
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle == null ? null : pageTitle.trim();
    }

    public String getPageHtmlUrl() {
        return pageHtmlUrl;
    }

    public void setPageHtmlUrl(String pageHtmlUrl) {
        this.pageHtmlUrl = pageHtmlUrl == null ? null : pageHtmlUrl.trim();
    }

    public Short getPageViewingCount() {
        return pageViewingCount;
    }

    public void setPageViewingCount(Short pageViewingCount) {
        this.pageViewingCount = pageViewingCount;
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

    public String getPageTag() {
        return pageTag;
    }

    public void setPageTag(String pageTag) {
        this.pageTag = pageTag == null ? null : pageTag.trim();
    }

    public Byte getPageIsPrivate() {
        return pageIsPrivate;
    }

    public void setPageIsPrivate(Byte pageIsPrivate) {
        this.pageIsPrivate = pageIsPrivate;
    }

    public String getPageImgurl() {
        return pageImgurl;
    }

    public void setPageImgurl(String pageImgurl) {
        this.pageImgurl = pageImgurl == null ? null : pageImgurl.trim();
    }

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription == null ? null : pageDescription.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pageTitle=").append(pageTitle);
        sb.append(", pageHtmlUrl=").append(pageHtmlUrl);
        sb.append(", pageViewingCount=").append(pageViewingCount);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", pageTag=").append(pageTag);
        sb.append(", pageIsPrivate=").append(pageIsPrivate);
        sb.append(", pageImgurl=").append(pageImgurl);
        sb.append(", pageDescription=").append(pageDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}