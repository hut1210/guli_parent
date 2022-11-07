package com.atguigu.guli.service.oss.service;

import java.io.InputStream;

/**
 * @author helen
 * @since 2020/4/15
 */
public interface FileService {

    /**
     * 阿里云oss文件上传
     * @param inputStream 输入流
     * @param module 文件夹名称
     * @param originalFilename 原始文件名
     * @return 文件在oss服务器上的url地址
     */
    String upload(InputStream inputStream, String module, String originalFilename);

    /**
     * 删除阿里云文件
     * @param url
     */
    void removeFile(String url);
}
