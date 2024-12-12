//package com.bezkoder.spring.jpa.h2.config;
//
//import org.springframework.boot.web.servlet.MultipartConfigFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.servlet.MultipartConfigElement;
//import java.io.File;
//
//@Configuration
//public class MultipartConfig {
//
//    @Bean
//    public MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize("100MB"); // Maximum file size
//        factory.setMaxRequestSize("100MB"); // Maximum request size
//        return factory.createMultipartConfig();
//    }
//}