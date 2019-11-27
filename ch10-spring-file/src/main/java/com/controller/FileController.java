package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @program: maven-spring-mvc-parent
 * @description:
 * @author: admin
 * @create: 2019-11-20 14:47
 **/
@Controller
public class FileController {

    @GetMapping("/unload")
    public String unload(){
        return "index";
    }

    @PostMapping("/unload")
    public String unload(MultipartFile myFile){
        String filename = myFile.getOriginalFilename();
        String directory ="G:/Test/picture";
        String path = directory + File.separator +filename;
        File file  = new File(path);

        try {
            myFile.transferTo(file);
        }catch (Exception e){
            throw new RuntimeException("文件上传失败");
        }
        return "ok";
    }
}
