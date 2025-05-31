package com.quanxiaoha.weblog.admin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import io.minio.MinioClient;


@Configuration
public class MinioConfig {
    @Autowired
    private MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        // 构建 Minio 客户端
        return MinioClient.builder()
                .endpoint(minioProperties.getEndpoint())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
    }
}
