package com.bezkoder.spring.jpa.h2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class S3Config {

    @Bean
    public S3Client s3Client() {
        // Replace with your actual AWS credentials and region
        AwsBasicCredentials awsCredentials = AwsBasicCredentials.create(
                "",
                ""
        );

        return S3Client.builder()
                .region(Region.AP_NORTHEAST_2) // Replace with your AWS region (e.g., US_EAST_1)
                .credentialsProvider(StaticCredentialsProvider.create(awsCredentials))
                .build();
    }
}
