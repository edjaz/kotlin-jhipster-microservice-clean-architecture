package fr.edjaz.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "fr.edjaz")
public class FeignConfiguration {

}
