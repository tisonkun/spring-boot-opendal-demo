package io.tisonkun.demo.springboot.opendal;

import java.util.Map;
import org.apache.opendal.Operator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenDALConfig {
    @Value("${opendal.scheme}")
    private String scheme;

    @Value("${opendal.endpoint}")
    private String endpoint;

    @Value("${opendal.bucket}")
    private String bucket;

    @Value("${opendal.region}")
    private String region;

    @Value("${opendal.access_key_id}")
    private String accessKeyId;

    @Value("${opendal.secret_access_key}")
    private String secretAccessKey;

    @Bean
    public Operator opendal() {
        return Operator.of(scheme, Map.of(
            "endpoint", endpoint,
            "bucket", bucket,
            "region", region,
            "access_key_id", accessKeyId,
            "secret_access_key", secretAccessKey
        ));
    }
}
