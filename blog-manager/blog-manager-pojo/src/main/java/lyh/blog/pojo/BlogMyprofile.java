package lyh.blog.pojo;

import java.io.Serializable;

public class BlogMyprofile implements Serializable {
    private Byte id;

    private String name;

    private Byte age;

    private String email;

    private String weibo;

    private String github;

    private String introduction;

    private String mywebUrl;

    private String headPortraitUrl;

    private static final long serialVersionUID = 1L;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo == null ? null : weibo.trim();
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getMywebUrl() {
        return mywebUrl;
    }

    public void setMywebUrl(String mywebUrl) {
        this.mywebUrl = mywebUrl == null ? null : mywebUrl.trim();
    }

    public String getHeadPortraitUrl() {
        return headPortraitUrl;
    }

    public void setHeadPortraitUrl(String headPortraitUrl) {
        this.headPortraitUrl = headPortraitUrl == null ? null : headPortraitUrl.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", email=").append(email);
        sb.append(", weibo=").append(weibo);
        sb.append(", github=").append(github);
        sb.append(", introduction=").append(introduction);
        sb.append(", mywebUrl=").append(mywebUrl);
        sb.append(", headPortraitUrl=").append(headPortraitUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}