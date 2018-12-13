package com.springboot.cli.controller;

import com.springboot.cli.util.FileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.UUID;

@RestController
@RequestMapping("/api/upload")
public class UploadController{
    @Resource
    private ResourceLoader resourceLoader;
    private Logger logger = LoggerFactory.getLogger(getClass());
    //处理文件上传
    @RequestMapping(value="/img", method = RequestMethod.POST)
    public @ResponseBody String uploadImg(@RequestParam("file") MultipartFile file,
                                          HttpServletRequest request) {

        String contentType = file.getContentType();   //图片文件类型
        String fileName = file.getOriginalFilename();  //图片名字

        //文件存放路径

        String filePath =System.getProperty("user.dir")+File.separator+"upload/";

        //调用文件处理类FileUtil，处理文件，将文件写入指定位置
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }

        // 返回图片的存放路径
        return filePath+fileName;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/get/{filename}")
    @ResponseBody
    public ResponseEntity<?> getFile(@PathVariable String filename,HttpServletRequest request) {
        try {
            //文件存放路径
            String filePath =System.getProperty("user.dir")+File.separator+"upload/";
            return ResponseEntity.ok(resourceLoader.getResource(
                    "file:" + Paths.get(filePath, filename).toString()));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}

