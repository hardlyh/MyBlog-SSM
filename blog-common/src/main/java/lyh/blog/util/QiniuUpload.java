package lyh.blog.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

/**
 * @ClassName: QiniuUpload
 * @Description: 七牛云上传组件
 * @author student.lyh
 * @date 2017年9月26日 下午5:11:59
 */
public class QiniuUpload {
    private static Zone zone;
    private static String accessKey;
    private static String secretKey;
    private static String bucket;
    
    static{
        InputStream ins=QiniuUpload.class.getClassLoader().getResourceAsStream("qiniu.properties");  
        Properties p = new Properties();  
        try {  
            p.load(ins);  
        }catch (FileNotFoundException e) {
            System.out.println("找不到文件");
        } catch (IOException e) {
            System.out.println("IO流错误");
        } finally {
            try {
                if(null != ins) {
                    ins.close();
                }
            } catch (IOException e) {
            }
        } 
        accessKey = p.getProperty("accessKey");
        secretKey = p.getProperty("secretKey");
        bucket = p.getProperty("bucket");
        String str =p.getProperty("fixedZone");
        switch(str){
            case "0":zone=Zone.zone0();break;
            case "1":zone=Zone.zone1();break;
            case "2":zone=Zone.zone2();break;
            case "3":zone=Zone.zoneNa0();break;
        }
    }

    public static String upload(InputStream in, String filename) throws Exception {
        Configuration cfg = new Configuration(zone);
        UploadManager uploadManager = new UploadManager(cfg);
        String key = filename;
//        String accessKey = "mIIKJO9gxKLSKEiUEiIRZHuU_oXPkYpZOhotSIYN";
//        String secretKey = "r9yHYzYX77jr1yoF7mv7jZCaL2xNgXNdPmE4N9U0";
        // String bucket = "frist";
//        String bucket = "e3-shop";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response2 = uploadManager.put(in, key, upToken, null, null);
            DefaultPutRet putRet = new Gson().fromJson(response2.bodyString(), DefaultPutRet.class);
            return key;
        } catch (QiniuException e) {
            Response r = e.response;
            e.printStackTrace();
            throw new Exception();
        } catch(Exception e2){
            throw new Exception();
        }
    }

}
