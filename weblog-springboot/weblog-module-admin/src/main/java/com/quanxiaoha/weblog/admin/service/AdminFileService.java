package com.quanxiaoha.weblog.admin.service;

import org.springframework.web.multipart.MultipartFile;
import com.quanxiaoha.weblog.common.utils.Response;

public interface AdminFileService {
    /**
     * 上传文件
     * 
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
