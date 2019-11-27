package com.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-20 16:02
 **/
@Controller
public class DownloadController {

    @RequestMapping("/download")
    public ResponseEntity<InputStreamSource> download(String filename) throws IOException {
        //在mac系统下pathSeparator值为: ,separator值为: /
        String fullPath = "D:/File/" + filename;

        File file = new File(fullPath);
        //这个guess方法是依据文件名来得到媒体类型也就是mime类型,
        // 比如常见有image/jpeg,application/json
        String mediaType = URLConnection.guessContentTypeFromName(filename);
        if(mediaType==null) {
            /*识别不了时,统统用这个,一般用来表示下载二进制数据*/
            mediaType = MediaType.APPLICATION_OCTET_STREAM_VALUE;
        }

        HttpHeaders respHeaders = new HttpHeaders();
        respHeaders.setContentType(MediaType.parseMediaType(mediaType));
        //attachment :附件的意思,表示告诉浏览器弹出一个另存为窗口来下载文件,
        // inline是直接在浏览器中打开下载的文件
        //需要进行URL编码处理,否则另存为对话框不能显示中文
        respHeaders.setContentDispositionFormData("attachment",
                URLEncoder.encode(filename,"UTF-8"));

        InputStreamResource isr =
                new InputStreamResource(new FileInputStream(file));
        return new ResponseEntity<>(isr, respHeaders, HttpStatus.OK);
    }



    @RequestMapping("/download2")
    public ResponseEntity<byte[]> download2(String filename) throws IOException {
        String fullPath = "D:/File/"+filename;
        File file = new File(fullPath);
        byte[] bytes = null;
        InputStream stream = new FileInputStream(file);
        //给字节数组添加有效的长度
        bytes = new byte[stream.available()];
        //把文件读取到字节数组里面
        stream.read(bytes);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + file.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(bytes, headers, statusCode);
        return entity;
    }
}
