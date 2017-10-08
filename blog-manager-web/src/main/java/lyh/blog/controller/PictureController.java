package lyh.blog.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lyh.blog.util.QiniuUpload;

/**
 * @ClassName: PictureController
 * @Description: 图上上传控制类
 * @author student.lyh
 * @date 2017年9月26日 下午4:52:05
 */
@Controller
public class PictureController {

    @Value("${qiniuUrl}")
    private String qiniuUrl;

    /**
     * @throws IOException
     * @Description: 上传图片 @return Map 返回类型 @throws
     */
    @RequestMapping(value = "/pic/upload", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=utf-8")
    @ResponseBody
    public String uploadFile(MultipartFile wangEditorH5File) throws IOException {
        InputStream in = wangEditorH5File.getInputStream();
        String originalFilename = wangEditorH5File.getOriginalFilename(); // 得到文件全名
        String key = null;
        try {
            key = QiniuUpload.upload(in, originalFilename);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String url = qiniuUrl + "/" + key;
        return url;
    }

}
