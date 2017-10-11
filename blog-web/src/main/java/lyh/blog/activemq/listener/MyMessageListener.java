package lyh.blog.activemq.listener;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.sun.tools.javac.jvm.Profile;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lyh.blog.common.pojo.ArticleDO;
import lyh.blog.pojo.BlogCategory;
import lyh.blog.pojo.BlogMyprofile;
import lyh.blog.pojo.BlogPage;
import lyh.blog.service.ArticleService;
import lyh.blog.service.CategoryService;
import lyh.blog.service.ProfileService;

/**
 * @ClassName: MyMessageListener
 * @Description: Activemq 接受消息
 * @author student.lyh
 * @date 2017年10月9日 下午7:17:11
 */
public class MyMessageListener implements MessageListener {

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private ProfileService profileService;

    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @Override
    public void onMessage(Message message) {

        try {
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            System.out.println("取出message : " + text);
            if("createLeft".equals(text)){
                BlogMyprofile profile = profileService.getProfileById((byte)1);
                List<BlogPage> listPage = articleService.listRankByConutview();
                try {
                    createLeft(profile,listPage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("left 页面静态化完成");
                return ;
            }
            Integer id = Integer.parseInt(text);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            ArticleDO<BlogPage> obj = articleService.toUpdate(id);
            try {
                createPage(obj);
            } catch (Exception e) {
                e.printStackTrace();
                log.error("静态化文章出错  : " + e.getMessage());
            }
            System.out.println("静态化文章完成  : " + text);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

    public String createPage(ArticleDO<BlogPage> articleDO) throws Exception {
        String path = System.getProperty("blog-web.root");
        path = path+"allarticle/";
        // 1、从spring容器中获得FreeMarkerConfigurer对象。
        // 2、从FreeMarkerConfigurer对象中获得Configuration对象。
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        configuration.setDefaultEncoding("utf-8");
        // 3、使用Configuration对象获得Template对象。
        Template template = configuration.getTemplate("template.jsp");
        // 4、创建数据集
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("articleDO", articleDO);
        // 5、创建输出文件的Writer对象。
        Writer out = new FileWriter(new File(path+articleDO.getObj().getPageHtmlUrl()+".jsp"));
        // 6、调用模板对象的process方法，生成文件。
        template.process(paramMap, out);
        // 7、关闭流。
        out.close();
        return "OK";
    }
    
    public String createLeft(BlogMyprofile profile, List<BlogPage> listPage) throws Exception {
        String path = System.getProperty("blog-web.root");
        // 1、从spring容器中获得FreeMarkerConfigurer对象。
        // 2、从FreeMarkerConfigurer对象中获得Configuration对象。
        Configuration configuration = freeMarkerConfigurer.getConfiguration();
        configuration.setDefaultEncoding("utf-8");
        // 3、使用Configuration对象获得Template对象。
        Template template = configuration.getTemplate("left.jsp");
        // 4、创建数据集
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("myprofile", profile);
        paramMap.put("listPage", listPage);
        // 5、创建输出文件的Writer对象。
        Writer out = new FileWriter(new File(path+"left.jsp"));
        // 6、调用模板对象的process方法，生成文件。
        template.process(paramMap, out);
        // 7、关闭流。
        out.close();
        return "OK";
    }
    
    

}